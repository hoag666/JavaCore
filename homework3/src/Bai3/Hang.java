package Bai3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private float donGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã hàng : ");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng : ");
        tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá : ");
        donGia = sc.nextFloat();
        sc.nextLine();
    }

    public void xuat() {

        System.out.println("Mã hàng : " + maHang);
        System.out.println("Tên hàng : " + tenHang);
        System.out.println("Đơn giá : " + donGia);
    }
}
