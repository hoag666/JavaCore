package QL_MayIn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LASERPRINTER laserprinter = new LASERPRINTER();
        DOTPRINTER dotprinter = new DOTPRINTER();
        int choose = 0;
        do {
            System.out.println("============ MENU ============");
            System.out.println("1.Nhập máy in kim");
            System.out.println("2.Nhập máy in laser");
            System.out.println("3.Hiển thị máy in kim");
            System.out.println("4.Hiển thị máy in laser");
            System.out.println("0.Thoát !!!");
            System.out.println("Mời bạn nhập lựa chọn : ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số !!!");
            }

            switch (choose) {
                case 1:
                    dotprinter.nhap();
                    break;
                case 2:
                    laserprinter.nhap();
                    break;
                case 3:
                    dotprinter.xuat();
                    break;
                case 4:
                    laserprinter.xuat();
                    break;
                case 0:
                    System.out.println("Thoát !!!");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại !!!");
                    break;
            }
        } while (choose != 0);
    }
}
