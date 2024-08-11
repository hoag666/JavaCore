package Bai2;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private NhaSanXuat x;

    public void nhap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------NHẬP THÔNG TIN-------------");

        System.out.print("Nhập mã hàng : ");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng : ");
        tenHang = sc.nextLine();
        System.out.println("Nhập nhà sản xuất ");
        x = new NhaSanXuat();
        x.nhap();
    }

    public void xuat() {
        System.out.println("--------------THÔNG TIN VỪA NHẬP-------------");
        System.out.println("Mã hàng : " + maHang);
        System.out.println("Tên hàng : " + tenHang);
        System.out.println("Nhà sản xuất ");
        x.xuat();
    }
}
