package QL_HangDienTu;

import java.util.Scanner;

public class HangDienTu extends SanPham {

    protected String congSuat;
    protected String dongDienSuDung;

    public HangDienTu() {
    }

    public HangDienTu(String maSanPham, String tenSanPham, String ngaySanXuat, float trongLuong, String mauSac, String congSuat, String dongDienSuDung) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDienSuDung = dongDienSuDung;
    }

    protected void nhap() {

        Scanner sc = new Scanner(System.in);

            System.out.print("Nhập mã sản phẩm : ");
            maSanPham = sc.nextLine();
            System.out.print("Nhập tên sản phẩm : ");
            tenSanPham = sc.nextLine();
            System.out.print("Nhập ngày sản xuất : ");
            ngaySanXuat = sc.nextLine();
            System.out.print("Nhập trọng lượng (kg) : ");
            trongLuong = sc.nextFloat();
            sc.nextLine();
            System.out.print("Nhập màu sắc : ");
            mauSac = sc.nextLine();
            System.out.print("Nhập công suất (kw) : ");
            congSuat = sc.nextLine();
            System.out.print("Nhập dòng điện sử dụng (1 chiều / 2 chiều) : ");
            dongDienSuDung = sc.nextLine();
    }

    protected void xuat(int stt) {

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("| %-5s | %-20s | %-20s | %13s | %11s | %10s | %10s | %17s |", stt, maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac, congSuat, dongDienSuDung));

    }
}