package B4;

import java.util.Scanner;

public class Chuoi {
    public static String nhapChuoi() {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Mời bạn nhập một chuỗi : ");
        chuoi = sc.nextLine();
        return chuoi;
    }

    public static void hienThiChuoi(String chuoi) {
        System.out.println("Chuỗi bạn vừa nhập là : " + chuoi);
    }

    public static void main(String[] args) {
        String chuoiNhap = nhapChuoi();
        hienThiChuoi(chuoiNhap);
    }
}
