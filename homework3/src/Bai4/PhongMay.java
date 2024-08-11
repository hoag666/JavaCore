package Bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May[] y;
    int n;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------NHẬP THÔNG TIN-----------");
        System.out.print("Nhập mã phòng : ");
        maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng : ");
        tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích : ");
        dienTich = sc.nextFloat();
        sc.nextLine();

        x = new QuanLy();
        x.nhap();

        System.out.print("Nhập số lượng máy : ");
        n = sc.nextInt();

        y = new May[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Máy thứ " + (i + 1));
            y[i] = new May();
            y[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("-------------THÔNG TIN VỪA NHẬP------------");
        System.out.println("Mã phòng : " + maPhong);
        System.out.println("Tên phòng : " + tenPhong);
        System.out.println("Diện tích : " + dienTich);
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("------------------");
            System.out.println("Máy thứ " + (i + 1));
            y[i].xuat();
        }
    }
}
