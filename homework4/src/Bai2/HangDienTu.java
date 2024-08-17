package Bai2;

import java.util.Scanner;

public class HangDienTu extends SanPham {

    protected String[] congSuat;
    protected String[] dongDienSuDung;

    public HangDienTu() {
    }

    public HangDienTu(String[] maSanPham, String[] tenSanPham, String[] ngaySanXuat, float[] trongLuong, String[] mauSac, String[] congSuat, String[] dongDienSuDung) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDienSuDung = dongDienSuDung;
    }

    protected void nhap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("================== NHẬP THÔNG TIN HÀNG ĐIỆN TỬ =================");
        System.out.print("Nhập số lượng sản phẩm : ");
        int n = sc.nextInt();
        sc.nextLine();

        maSanPham = new String[n];
        tenSanPham = new String[n];
        ngaySanXuat = new String[n];
        trongLuong = new float[n];
        mauSac = new String[n];
        congSuat = new String[n];
        dongDienSuDung = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));
            System.out.print("Nhập mã sản phẩm : ");
            maSanPham[i] = sc.nextLine();
            System.out.print("Nhập tên sản phẩm : ");
            tenSanPham[i] = sc.nextLine();
            System.out.print("Nhập ngày sản xuất : ");
            ngaySanXuat[i] = sc.nextLine();
            System.out.print("Nhập trọng lượng (kg) : ");
            trongLuong[i] = sc.nextFloat();
            sc.nextLine();
            System.out.print("Nhập màu sắc : ");
            mauSac[i] = sc.nextLine();
            System.out.print("Nhập công suất (kw) : ");
            congSuat[i] = sc.nextLine();
            System.out.print("Nhập dòng điện sử dụng (1 chiều / 2 chiều) : ");
            dongDienSuDung[i] = sc.nextLine();
        }
    }

    protected void xuat() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================================================================================================================");
        System.out.println("================================================= DANH SÁCH HÀNG ĐIỆN TỬ ==========================================================");
        System.out.println(String.format("| %-5s | %-20s | %-20s | %-10s | %-10s | %-10s | %-10s | %-15s |", "STT", "Mã sản phẩm", "Tên sản phẩm", "Ngày sản xuất", "Trọng lượng", "Màu sắc", "Công suất", "Dòng điện sử dụng"));
        for (int i = 0; i < maSanPham.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("| %-5s | %-20s | %-20s | %13s | %11s | %10s | %10s | %17s |", i + 1, maSanPham[i], tenSanPham[i], ngaySanXuat[i], trongLuong[i], mauSac[i], congSuat[i], dongDienSuDung[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Nhấn ENTER tiếp tục ....");
        sc.nextLine();
    }

    protected void matHangMin() {

        Scanner sc = new Scanner(System.in);

        String[] maSanPhamTmp = maSanPham.clone();
        String[] tenSanPhamTmp = tenSanPham.clone();
        String[] ngaySanXuatTmp = ngaySanXuat.clone();
        float[] trongLuongTmp = trongLuong.clone();
        String[] mauSacTmp = mauSac.clone();
        String[] congSuatTmp = congSuat.clone();
        String[] dongDienSuDungTmp = dongDienSuDung.clone();
        for (int i = 0; i < trongLuong.length - 1; i++) {
            for (int j = i + 1; j < trongLuong.length; j++) {
                if (trongLuongTmp[i] > trongLuongTmp[j]) {

                    float tmp = trongLuongTmp[i];
                    trongLuongTmp[i] = trongLuongTmp[j];
                    trongLuongTmp[j] = tmp;

                    String tmp1 = maSanPhamTmp[i];
                    maSanPhamTmp[i] = maSanPhamTmp[j];
                    maSanPhamTmp[j] = tmp1;

                    String tmp2 = tenSanPhamTmp[i];
                    tenSanPhamTmp[i] = tenSanPhamTmp[j];
                    tenSanPhamTmp[j] = tmp2;

                    String tmp3 = ngaySanXuatTmp[i];
                    ngaySanXuatTmp[i] = ngaySanXuatTmp[j];
                    ngaySanXuatTmp[j] = tmp3;

                    String tmp4 = mauSacTmp[i];
                    mauSacTmp[i] = mauSacTmp[j];
                    mauSacTmp[j] = tmp4;

                    String tmp5 = congSuatTmp[i];
                    congSuatTmp[i] = congSuatTmp[j];
                    congSuatTmp[j] = tmp5;

                    String tmp6 = dongDienSuDungTmp[i];
                    dongDienSuDungTmp[i] = dongDienSuDungTmp[j];
                    dongDienSuDungTmp[j] = tmp6;

                }

            }
        }

        System.out.println("===================================================================================================================================");
        System.out.println("======================================= DANH SÁCH MẶT HÀNG CÓ TRỌNG LƯỢNG THẤP NHẤT ===============================================");
        System.out.println(String.format("| %-5s | %-20s | %-20s | %-10s | %-10s | %-10s | %-10s | %-15s |", "STT", "Mã sản phẩm", "Tên sản phẩm", "Ngày sản xuất", "Trọng lượng", "Màu sắc", "Công suất", "Dòng điện sử dụng"));
        for (int i = 0; i < trongLuong.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("| %-5s | %-20s | %-20s | %13s | %11s | %10s | %10s | %17s |", i + 1, maSanPhamTmp[i], tenSanPhamTmp[i], ngaySanXuatTmp[i], trongLuongTmp[i], mauSacTmp[i], congSuatTmp[i], dongDienSuDungTmp[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Nhấn ENTER tiếp tục ....");
        sc.nextLine();
    }
}
