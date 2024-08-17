package Bai2;

import java.util.Scanner;

public class QuanLyHangDienTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HangDienTu hangDienTu = new HangDienTu();

        int choose = 0;

        do {
            System.out.println("================== MENU ===================");
            System.out.println("1. Nhập danh sách n hàng điện tử");
            System.out.println("2. Hiển thị danh sách hàng điện tử");
            System.out.println("3. Hiển thị các mặt hàng có trọng lượng thấp nhất");
            System.out.println("0. Thoát !!!");
            System.out.print("Mời bạn nhập lựa chọn : ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số !!!");
            }

            switch (choose) {
                case 1:
                    hangDienTu.nhap();
                    break;
                case 2:
                    hangDienTu.xuat();
                    break;
                case 3:
                    hangDienTu.matHangMin();
                    break;
                case 0:
                    System.out.println("Thoát !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");

            }
        } while (choose != 0);
    }
}
