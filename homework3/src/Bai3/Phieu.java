package Bai3;

import java.util.Scanner;

public class Phieu {

    private String maPhieu;
    private Hang[] x;
    int n;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------NHẬP THÔNG TIN------------");

        System.out.print("Nhập mã phiếu : ");
        maPhieu = sc.nextLine();
        System.out.print("Nhập số lượng hàng : ");
        n = sc.nextInt();

        x = new Hang[n];

        for (int i = 0; i < n; i++) {
            x[i] = new Hang();
            System.out.println("Mã hàng thứ " + (i + 1) + " : ");
            x[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("---------------- THÔNG TIN VỪA NHẬP ----------------");
        System.out.println("Mã phiếu : " + maPhieu);
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------");
            System.out.println("Hàng thứ " + (i + 1));
            x[i].xuat();
        }
    }
}
