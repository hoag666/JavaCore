package QL_SinhVien;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoDem;
    private String ten;
    private String namSinh;
    private String gioiTinh;

    private HocPhan[] listHocPhan;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoDem, String ten, String namSinh, String gioiTinh, HocPhan[] listHocPhan) {
        this.maSinhVien = maSinhVien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.listHocPhan = listHocPhan;
    }

    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("Nhập mã sinh viên : ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhập họ đệm : ");
        hoDem = sc.nextLine();
        System.out.println("Nhập tên : ");
        ten = sc.nextLine();
        System.out.println("Nhập năm sinh : ");
        namSinh = sc.nextLine();
        System.out.println("Nhập giới tính : ");
        gioiTinh = sc.nextLine();

        System.out.println("Nhập số lượng học phần : ");
        int n = Integer.parseInt(sc.nextLine());
        listHocPhan = new HocPhan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học phần " + (i + 1));
            listHocPhan[i] = new HocPhan();
            listHocPhan[i].nhapHocPhan();
        }

    }

    public void showSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t THÔNG TIN SINH VIÊN");
        System.out.println(String.format("Mã sinh viên: %-5s \t\t\t\t\t\t Họ và tên: %-5s ", maSinhVien, hoDem.concat(" " + ten)));
        System.out.println(String.format("Năm sinh: %-5s \t\t\t\t\t\t\t Giới tính: %-5s ", namSinh, gioiTinh));

        float tongDiemHocPhan = 0;
        int tongSoTinChi = 0;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(String.format("%-5s | %-20s | %-15s | %-10s | %-10s |", "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "Điểm học phần"));
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < listHocPhan.length; i++) {
            System.out.println(String.format("%-5s | %-20s | %-15s | %10s | %13s |", i + 1, listHocPhan[i].getMaHocPhan(),
                    listHocPhan[i].getTenHocPhan(), listHocPhan[i].getSoTinChi(), listHocPhan[i].getDiemHocPhan()));
            System.out.println("-----------------------------------------------------------------------------");
        }

        for (int i = 0; i < listHocPhan.length; i++) {
            tongDiemHocPhan += listHocPhan[i].getSoTinChi() * listHocPhan[i].getDiemHocPhan();
            tongSoTinChi += listHocPhan[i].getSoTinChi();
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Điểm tổng kết : " + tongDiemHocPhan / tongSoTinChi);
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin mới về sinh viên");
        System.out.print("Nhập họ :");
        hoDem = sc.nextLine();
        System.out.print("Nhập tên : ");
        ten = sc.nextLine();
        System.out.print("Nhập năm sinh : ");
        namSinh = sc.nextLine();
        System.out.print("Nhập giới tính : ");
        gioiTinh = sc.nextLine();
        System.out.println("Sửa thành công!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void suaHocPhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn học phần sửa :");
        String maHocPhan = sc.nextLine();

        for (int i = 0; i < listHocPhan.length; i++) {
            if (listHocPhan[i].getMaHocPhan().equals(maHocPhan)) {
                System.out.println("Nhập điểm mới của học phần : ");
                float diemMoi = Float.parseFloat(sc.nextLine());
                listHocPhan[i].setDiemHocPhan(diemMoi);

                System.out.println("Sửa thành công!");
                System.out.print("Nhấn ENTER để tiếp tục ...");
                sc.nextLine();
            }
        }
        System.out.println("Không có mã học phần này !!!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public HocPhan[] getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(HocPhan[] listHocPhan) {
        this.listHocPhan = listHocPhan;
    }
}