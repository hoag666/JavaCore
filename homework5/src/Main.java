import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static SinhVien[] sinhViens;
    public static MonHoc[] monHocs;
    public static Diem[] diems;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        addSinhVien(new SinhVien("SV01", "Nguyễn Bá", "Việt Hoàng", 2006, "Nam"));
        addSinhVien(new SinhVien("SV02", "Nguyễn Quốc", "Cường", 2002, "Nữ"));
        addSinhVien(new SinhVien("SV03", "Vũ Đức", "Dũng", 2003, "Nữ"));
        addSinhVien(new SinhVien("SV04", "Phạm", "Trường", 2000, "Nam"));

        addMonHoc(new MonHoc("M01", "Toán", 3));
        addMonHoc(new MonHoc("M02", "Văn", 2));
        addMonHoc(new MonHoc("M03", "Anh", 4));

        addBangDiem(new Diem("SV01", "M02", 5));
        addBangDiem(new Diem("SV02", "M02", 6));
        addBangDiem(new Diem("SV01", "M01", 7));
        addBangDiem(new Diem("SV03", "M03", 9));
        addBangDiem(new Diem("SV03", "M02", 4));
        addBangDiem(new Diem("SV04", "M02", 2));
        addBangDiem(new Diem("SV03", "M01", 5));


        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("===================== MENU =====================");
            System.out.println("1.Quản lý sinh viên");
            System.out.println("2.Quản lý môn học");
            System.out.println("3.Quản lý bảng điểm");
            System.out.println("4.Hiển thị bảng điểm");
            System.out.println("5.Tìm kiếm");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    quanLySinhVien();
                    break;
                case 2:
                    quanLyMonHoc();
                    break;
                case 3:
                    quanLyBangDiem();
                    break;
                case 4:
                    showBangDiem();
                    break;
                case 5:
                    timKiem();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);
    }


    private static SinhVien getSinhVien(String maSV) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i].getMaSV().equals(maSV)) {
                return sinhViens[i];
            }
        }
        return null;
    }

    private static MonHoc getMonHoc(String maMon) {
        for (int i = 0; i < monHocs.length; i++) {
            if (monHocs[i].getMaMon().equals(maMon)) {
                return monHocs[i];
            }
        }
        return null;
    }


    //=========================== SINH VIEN ============================

    private static void quanLySinhVien() {
        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("============== QUAN LY SINH VIEN ===============");
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.Sửa thông tin sinh viên");
            System.out.println("3.Xóa thông tin sinh viên");
            System.out.println("4.Hiển thị danh sách sinh viên");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    suaThongTin();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    showSinhVien();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);
    }

    private static void addSinhVien(SinhVien sinhVienNew) {
        if (sinhViens == null) {
            sinhViens = new SinhVien[1];
            sinhViens[0] = sinhVienNew;
        } else {
            SinhVien[] tmp = sinhViens.clone();
            sinhViens = new SinhVien[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                sinhViens[i] = tmp[i];
            }
            sinhViens[tmp.length] = sinhVienNew;
        }
    }

    private static void updateSinhVien(SinhVien sinhVienUpdate) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhVienUpdate.getMaSV().equals(sinhViens[i].getMaSV())) {
                sinhViens[i] = sinhVienUpdate;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Sinh viên cần sửa không tồn tại!");
    }

    private static void deleteSinhVien(String maSV) {
        if (sinhViens.length == 0) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        SinhVien[] ans = null;

        for (int i = 0; i < sinhViens.length; i++) {
            if (maSV.equals(sinhViens[i].getMaSV())) {
                if (ans == null) {
                    ans = new SinhVien[1];
                    ans[0] = sinhViens[i];
                } else {
                    SinhVien[] tmp = ans.clone();
                    ans = new SinhVien[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = sinhViens[i];
                }
            }
        }
        if (ans.length == sinhViens.length) {
            System.out.println("Mã sinh viên không tồn tại !");
        } else {
            sinhViens = ans.clone();
            System.out.println("Xóa sinh viên thành công !!!");
        }
    }

    private static void showSinhVien() {
        if (sinhViens == null || sinhViens.length == 0) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s | %15s | %15s |", "STT", "Mã SV", "Họ đệm", "Tên", "Năm sinh", "Giới tính"));
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < sinhViens.length; i++) {
            System.out.println(String.format("%-3d | %-10s | %-15s | %-10s | %15d | %15s |",
                    i + 1, sinhViens[i].getMaSV(), sinhViens[i].getHoDem(), sinhViens[i].getTen(), sinhViens[i].getNamSinh(), sinhViens[i].getGioiTinh()));
        }
    }

    private static void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên : ");
        String maSV = sc.nextLine();
        System.out.println("Nhập họ đệm : ");
        String hoDem = sc.nextLine();
        System.out.println("Nhập tên : ");
        String ten = sc.nextLine();
        System.out.println("Nhập năm sinh : ");
        int namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioiTinh = sc.nextLine();

        SinhVien sv = new SinhVien(maSV, hoDem, ten, namSinh, gioiTinh);
        addSinhVien(sv);
        System.out.println("Thêm sinh viên thành công !");
    }

    private static void suaThongTin() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên cần sửa : ");
        String maSV = sc.nextLine();
        SinhVien sv = getSinhVien1(maSV);
        if (sv == null) {
            System.out.println("Sinh viên không tồn tại!!!");
            return;
        }
        System.out.println("Nhập họ đệm : ");
        String hoDem = sc.nextLine();
        System.out.println("Nhập tên :");
        String ten = sc.nextLine();
        System.out.println("Nhập năm sinh : ");
        int namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioiTinh = sc.nextLine();

        SinhVien sinhVien = new SinhVien(maSV, hoDem, ten, namSinh, gioiTinh);
        updateSinhVien(sinhVien);
    }

    private static SinhVien getSinhVien1(String maSV) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i].getMaSV().equals(maSV)) {
                return sinhViens[i];
            }
        }
        return null;
    }

    private static void xoaSinhVien() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String maSV = sc.nextLine();
        deleteSinhVien(maSV);

    }

    //==================================================================
    //============================ MON HOC =============================

    private static void quanLyMonHoc() {
        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("=============== QUAN LY MON HOC ================");
            System.out.println("1.Thêm môn học");
            System.out.println("2.Sửa thông tin môn học");
            System.out.println("3.Xóa thông tin môn học");
            System.out.println("4.Hiển thị danh sách môn học");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    nhapMonHoc();
                    break;
                case 2:
                    suaThongTinMonHoc();
                    break;
                case 3:
                    xoaMonHoc();
                    break;
                case 4:
                    showMonHoc();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);
    }

    private static void addMonHoc(MonHoc monHocNew) {
        if (monHocs == null) {
            monHocs = new MonHoc[1];
            monHocs[0] = monHocNew;
        } else {
            MonHoc[] tmp = monHocs.clone();
            monHocs = new MonHoc[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                monHocs[i] = tmp[i];
            }
            monHocs[tmp.length] = monHocNew;
        }
    }

    private static void updateMonHoc(MonHoc monHocUpdate) {
        for (int i = 0; i < monHocs.length; i++) {
            if (Objects.equals(monHocUpdate.getMaMon(), monHocs[i].getMaMon())) {
                monHocs[i] = monHocUpdate;
                System.out.println("Sửa thành công!");
                return;
            }
        }
        System.out.println("Môn học cần sửa không tồn tại!");
    }

    private static void deleteMonHoc(String maMon) {

        if (monHocs.length == 0) {
            System.out.println("Danh sách môn học trống!");
            return;
        }

        MonHoc[] ans = null;

        for (int i = 0; i < monHocs.length; i++) {
            if (!Objects.equals(maMon, monHocs[i].getMaMon())) {
                if (ans == null) {
                    ans = new MonHoc[1];
                    ans[0] = monHocs[i];
                } else {
                    MonHoc[] tmp = ans.clone();
                    ans = new MonHoc[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = monHocs[i];
                }
            }
        }

        if (ans.length == monHocs.length) {
            System.out.println("Mã môn học không tồn tại!");
        } else {
            monHocs = ans.clone();
            System.out.println("Xóa môn học thành công!");
        }
    }

    private static void nhapMonHoc() {
        sc.nextLine();
        System.out.println("Nhập mã môn học : ");
        String maMon = sc.nextLine();
        System.out.println("Nhập tên môn học : ");
        String tenMon = sc.nextLine();
        System.out.println("Nhập hệ số môn học : ");
        int heSo = sc.nextInt();
        sc.nextLine();

        MonHoc mh = new MonHoc(maMon, tenMon, heSo);
        addMonHoc(mh);
        System.out.println("Thêm môn học thành công !");
    }

    private static void suaThongTinMonHoc() {
        sc.nextLine();
        System.out.println("Nhập mã môn học cần sửa : ");
        String maMon = sc.nextLine();
        MonHoc mh = getMonHoc1(maMon);
        if (mh == null) {
            System.out.println("Môn học không tồn tại!!!");
            return;
        }
        System.out.println("Nhập tên môn : ");
        String tenMon = sc.nextLine();
        System.out.println("Nhập hệ số môn :");
        int heSo = sc.nextInt();
        sc.nextLine();

        MonHoc monHocMoi = new MonHoc(maMon, tenMon, heSo);
        updateMonHoc(monHocMoi);
    }

    private static MonHoc getMonHoc1(String maMon) {
        for (int i = 0; i < monHocs.length; i++) {
            if (monHocs[i].getMaMon().equals(maMon)) {
                return monHocs[i];
            }
        }
        return null;
    }


    private static void showMonHoc() {
        if (monHocs == null || monHocs.length == 0) {
            System.out.println("Danh sách môn học trống!");
            return;
        }
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s |", "STT", "Mã môn", "Tên môn", "Hệ số"));
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < monHocs.length; i++) {
            System.out.println(String.format("%-3d | %-10s | %-15s | %-10s |",
                    i + 1, monHocs[i].getMaMon(), monHocs[i].getTenMon(), monHocs[i].getHeSo()));
        }
    }

    private static void xoaMonHoc() {
        sc.nextLine();
        System.out.println("Nhập mã môn học cần xóa: ");
        String maMon = sc.nextLine();
        deleteMonHoc(maMon);

    }

    //=================================================================
    //======================== BANG DIEM ==============================

    private static void quanLyBangDiem() {
        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("============== QUAN LY BANG DIEM ===============");
            System.out.println("1.Thêm điểm của một sinh viên học một môn học");
            System.out.println("2.Sửa điểm một môn học của một sinh viên");
            System.out.println("3.Xóa điểm một môn học của sinh viên");
            System.out.println("4.Hiển thị danh sách sinh viên");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    nhapBangDiem();
                    break;
                case 2:
                    suaDiem();
                    break;
                case 3:
                    xoaDiem();
                    break;
                case 4:
                    showBangDiem1();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);
    }

    private static void addBangDiem(Diem bangDiemNew) {
        if (diems == null) {
            diems = new Diem[1];
            diems[0] = bangDiemNew;
        } else {
            Diem[] tmp = diems.clone();
            diems = new Diem[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                diems[i] = tmp[i];
            }
            diems[tmp.length] = bangDiemNew;
        }
    }

    private static void updateDiem(Diem dataUpdate) {
        for (int i = 0; i < diems.length; i++) {
            if (Objects.equals(dataUpdate.getMaMon(), diems[i].getMaMon())
                    && Objects.equals(dataUpdate.getMaSV(), diems[i].getMaSV())
            ) {
                diems[i] = dataUpdate;
                System.out.println("Sửa thành công!");
                return;
            }
        }
        System.out.println("Môn học cần sửa không tồn tại!");
    }

    private static void suaDiem() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên cần sửa điểm : ");
        String maSV = sc.nextLine();
        System.out.println("Nhập mã môn học cần sửa điểm : ");
        String maMon = sc.nextLine();
        SinhVien sv = getSinhVien1(maSV);
        MonHoc mh = getMonHoc1(maMon);
        if (mh == null || sv == null) {
            System.out.println("Môn học không tồn tại!!!");
            return;
        }
        System.out.println("Nhập điểm : ");
        float diem = sc.nextFloat();
        sc.nextLine();

        Diem diem1 = new Diem(maSV, maMon, diem);
        updateDiem(diem1);
    }

    private static void deleteDiem(String maSV, String maMon) {

        if (diems.length == 0) {
            System.out.println("Danh sách điểm trống!");
            return;
        }

        Diem[] ans = null;

        for (int i = 0; i < diems.length; i++) {
            if (!Objects.equals(maMon, diems[i].getMaMon())
                    || !Objects.equals(maSV, diems[i].getMaSV())
            ) {
                if (ans == null) {
                    ans = new Diem[1];
                    ans[0] = diems[i];
                } else {
                    Diem[] tmp = ans.clone();
                    ans = new Diem[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = diems[i];
                }
            }
        }

        if (ans.length == diems.length) {
            System.out.println("Điểm của sinh viên không tồn tại!");
        } else {
            diems = ans.clone();
            System.out.println("Xóa điểm thành công!");
        }
    }

    private static void nhapBangDiem() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên : ");
        String maSV = sc.nextLine();
        System.out.println("Nhập mã môn học : ");
        String maMon = sc.nextLine();
        System.out.println("Nhập điểm số : ");
        float diem = sc.nextFloat();
        sc.nextLine();

        Diem diem1 = new Diem(maSV, maMon, diem);
        addBangDiem(diem1);
        System.out.println("Thêm điểm thành công !");
    }

    private static void showBangDiem1() {
        if (diems == null || diems.length == 0) {
            System.out.println("Danh sách điểm trống!");
            return;
        }
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s |", "STT", "Mã SV", "Mã môn", "Điểm"));
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < diems.length; i++) {
            System.out.println(String.format("%-3d | %-10s | %-15s | %-10s |",
                    i + 1, diems[i].getMaSV(), diems[i].getMaMon(), diems[i].getDiem()));
        }
    }

    private static void xoaDiem() {
        sc.nextLine();
        System.out.println("Nhập mã sv cần xóa: ");
        String maSV = sc.nextLine();
        System.out.println("Nhập mã môn học cần xóa: ");
        String maMon = sc.nextLine();
        deleteDiem(maSV, maMon);

    }

    //=================================================================
    //========================== SHOW BANG DIEM =======================

    private static void showBangDiem() {

        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("================= SHOW BANG DIEM ===============");
            System.out.println("1.Show theo từng sinh viên");
            System.out.println("2.Show theo từng môn học");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    showTheoSinhVien();
                    break;
                case 2:
                    showTheoMonHoc();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);

    }

    private static void showTheoMonHoc() {
        sc.nextLine();
        System.out.println("Nhập mã môn : ");
        String maMon = sc.nextLine();
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s | %10s | %5s |", "STT", "Mã SV", "Họ đệm", "Tên", "Tên môn học", "Điểm"));
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaMon().equals(maMon)) {
                SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
                MonHoc monHoc = getMonHoc(diems[i].getMaMon());

                System.out.println(String.format("%-3d | %-10s | %-15s | %-10s | %10s | %5.1f |",
                        i + 1, diems[i].getMaSV(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));
            }
        }
    }

    private static void showTheoSinhVien() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên : ");
        String maSV = sc.nextLine();
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s | %10s | %5s |", "STT", "Mã SV", "Họ đệm", "Tên", "Tên môn học", "Điểm"));
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaSV().equals(maSV)) {
                SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
                MonHoc monHoc = getMonHoc(diems[i].getMaMon());
                System.out.println(String.format("%-3d | %-10s | %-15s | %-10s | %10s | %5.1f |",
                        i + 1, diems[i].getMaSV(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));

            }
        }
    }


    //=================================================================
    //========================== TIM KIEM =============================

    private static void timKiem() {
        int choose = -1;
        do {

            System.out.println("================================================");
            System.out.println("=================== TIM KIEM ===================");
            System.out.println("1.Tìm kiếm theo mã sinh viên");
            System.out.println("2.Tìm kiếm theo mã môn học");
            System.out.println("0.THOÁT !!!");
            System.out.print("CHỌN : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số");
            }

            switch (choose) {
                case 1:
                    timKiemTheoSinhVien();
                    break;
                case 2:
                    timKiemTheoMaMon();
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }
        } while (choose != 0);

    }

    private static void timKiemTheoSinhVien() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên : ");
        String maSV = sc.nextLine();
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s | %10s | %5s |", "STT", "Mã môn", "Họ đệm", "Tên", "Tên môn học", "Điểm"));
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaSV().equals(maSV)) {
                SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
                MonHoc monHoc = getMonHoc(diems[i].getMaMon());
                System.out.println(String.format("%-3d | %-10s | %-15s | %-10s | %10s | %5.1f |",
                        i + 1, diems[i].getMaMon(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));

            }
        }
    }

    private static void timKiemTheoMaMon() {
        sc.nextLine();
        System.out.println("Nhập mã môn : ");
        String maMon = sc.nextLine();
        System.out.println(String.format("%-3s | %-10s | %-15s | %-10s | %10s | %5s |", "STT", "Mã SV", "Họ đệm", "Tên", "Tên môn học", "Điểm"));
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaMon().equals(maMon)) {
                SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
                MonHoc monHoc = getMonHoc(diems[i].getMaMon());

                System.out.println(String.format("%-3d | %-10s | %-15s | %-10s | %10s | %5.1f |",
                        i + 1, diems[i].getMaSV(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));
            }
        }
    }

    //=================================================================

}