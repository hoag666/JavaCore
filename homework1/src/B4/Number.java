package B4;

import java.util.Scanner;

public class Number {
    public static double nhapSo() {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Mời bạn nhập một số : ");
        num = Double.parseDouble(sc.nextLine());
        return num;
    }

    public static void hienThiSo(double num) {
        System.out.println("Số bạn vừa nhập là : " + num);
    }

    public static void main(String[] args) {
        double soNhap = nhapSo();
        hienThiSo(soNhap);
    }
}
