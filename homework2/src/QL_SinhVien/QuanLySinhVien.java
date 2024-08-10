package QL_SinhVien;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapSinhVien();

        int choose;

        do {
            System.out.println("========================== MENU =========================");
            System.out.println("1. Hiển thị thông tin về sinh viên ");
            System.out.println("2. Sửa các thông tin của sinh viên ");
            System.out.println("3. Tìm và sửa điểm học phần theo mã học phần");
            System.out.println("0. Thoát !!!");
            System.out.println("Mời bạn nhập lựa chọn : ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số !!!");
                return;
            }

            switch (choose) {
                case 1:
                    sinhVien.showSinhVien();
                    break;
                case 2:
                    sinhVien.edit();
                    break;
                case 3:
                    sinhVien.suaHocPhan();
                    break;
                case 0:
                    System.out.println("Thoát !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }

        } while (choose != 0);
    }
}
