package QL_MayIn;

import java.util.Scanner;

public class LASERPRINTER extends PRINTER {

    private int doPhanGiai;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("============= NHẬP MÁY IN LASER =============");
        System.out.print("Nhập độ phân giải : ");
        doPhanGiai = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập trọng lượng : ");
        trongLuong = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhập hãng sản xuất : ");
        hangSanXuat = sc.nextLine();
        System.out.print("Nhập năm sản xuất : ");
        namSanXuat = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tốc độ (trang/phút) : ");
        tocDo = sc.nextFloat();
    }

    public void xuat() {
        Scanner sc = new Scanner(System.in);

        System.out.println("============= MÁY IN LASER ===============");
        System.out.println("Độ phân giải : " + doPhanGiai);
        System.out.println("Trọng lượng : " + trongLuong);
        System.out.println("Hãng sản xuất : " + hangSanXuat);
        System.out.println("Năm sản xuất : " + namSanXuat);
        System.out.println("Tốc độ (trang/phút) : " + tocDo);
        System.out.println("------------------------------------------");
        System.out.println("Nhấn ENTER tiếp tục ...");
        sc.nextLine();
    }
}
