package Bai2;

import java.util.Scanner;

public class NhaSanXuat {
    private String maSanXuat;
    private String tenNhaSanXuat;
    private String diaChiNhaSanXuat;

    public void nhap() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sản xuất : ");
        maSanXuat = sc.nextLine();
        System.out.print("Nhập tên nhà sản xuất : ");
        tenNhaSanXuat = sc.nextLine();
        System.out.print("Nhập địa chỉ nhà sản xuất : ");
        diaChiNhaSanXuat = sc.nextLine();
    }

    public void xuat() {

        System.out.println("Mã sản xuất : " + maSanXuat);
        System.out.println("Tên nhà sản xuất : " + tenNhaSanXuat);
        System.out.println("Địa chỉ nhà sản xuất : " + diaChiNhaSanXuat);

    }

}
