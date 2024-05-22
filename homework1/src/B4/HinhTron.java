package B4;

import java.util.Scanner;

public class HinhTron {
    public static double tinhChuVi(double r) {
        return 2 * r * Math.PI;
    }

    public static double tinhDienTich(double r) {
        return r * r * Math.PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Mời bạn nhập bán kính hình tròn : ");
        r = Double.parseDouble(sc.nextLine());
        double chuVi;
        double dienTich;
        chuVi = tinhChuVi(r);
        dienTich = tinhDienTich(r);
        System.out.println("Chu vi hình tròn là : " + chuVi);
        System.out.println("Diện tích hình tròn là : " + dienTich);
    }
}

