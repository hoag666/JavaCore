package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQuanLy;
    private String hoTen;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý : ");
        maQuanLy = sc.nextLine();
        System.out.print("Nhập họ tên : ");
        hoTen = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã quản lý : " + maQuanLy);
        System.out.println("Họ tên : " + hoTen);
    }
}
