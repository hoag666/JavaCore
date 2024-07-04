package B6;

import java.util.Scanner;

public class toDanPho {

    static String[] chuHo = new String[]{
            "Nguyen Ba Viet Hoang", "Nguyen Quoc Cuong", "Vu Duc Dung", "Nguyen Duy Hung", "Tran Van Truong", "Dang Van truong"
    };

    static int[] soDien = new int[]{
            100, 120, 200, 500, 250, 300
    };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choose;

        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Hiển thị danh sách tiền điện.");
            System.out.println("2. Hiển thị 3 hộ gia đình có số kwh điện tiêu thụ nhiều nhất.");
            System.out.println("3. Hiển thị các hộ gia đình có chủ hộ tên \"Truong\".");
            System.out.println("4. Sắp danh sách các hộ gia đình theo tên với thứ tự bảng chữ cái.");
            System.out.println("5. Sắp xếp danh sách các hộ gia đình theo số kwh điện tăng dần.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn: ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }

            switch (choose) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showTop(3);
                    break;
                case 3:
                    showFillName("Truong");
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByKw();
                    break;
                case 0:
                    System.out.println("Thoát.....");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
            
        } while (choose != 0);
    }

    private static void showAll() {
        System.out.println("---------------------------- DANH SÁCH -------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s |", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < chuHo.length; i++) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s |", i + 1, chuHo[i], soDien[i], soDien[i] * 1000));
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showTop(int top) {

        String[] chuHoTmp = chuHo.clone();
        int[] soDienTmp = soDien.clone();

        for (int i = 0; i < chuHoTmp.length - 1; i++) {
            for (int j = i + 1; j < chuHoTmp.length; j++) {
                if (soDienTmp[i] < soDienTmp[j]) {
                    int tmp = soDienTmp[i];
                    soDienTmp[i] = soDienTmp[j];
                    soDienTmp[j] = tmp;

                    String tmp2 = chuHoTmp[i];
                    chuHoTmp[i] = chuHoTmp[j];
                    chuHoTmp[j] = tmp2;
                }
            }
        }
        System.out.println("---------------------------- DANH SÁCH -------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s |", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < chuHo.length; i++) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s |", i + 1, chuHoTmp[i], soDienTmp[i], soDienTmp[i] * 1000));
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showFillName(String name) {
        System.out.println("---------------------------- DANH SÁCH -------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s |", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < chuHo.length; i++) {
            if (chuHo[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println(String.format("%-5s | %-30s | %10d | %15s |", i + 1, chuHo[i], soDien[i], soDien[i] * 1000));
            }
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void sortByName() {
        for (int i=0; i < soDien.length - 1; i++) {
            for (int j = i+1; j<soDien.length; j++) {
                if (chuHo[i].compareTo(chuHo[j]) > 0 ) {

                    int tmp = soDien[i];
                    soDien[i] = soDien[j];
                    soDien[j] = tmp;

                    String tmp2 = chuHo[i];
                    chuHo[i] = chuHo[j];
                    chuHo[j] = tmp2;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();

    }

    private static void sortByKw() {

        for (int i = 0; i < chuHo.length - 1; i++) {
            for (int j = i + 1; j < chuHo.length; j++) {
                if (soDien[i] > soDien[j]) {
                    int tmp = soDien[i];
                    soDien[i] = soDien[j];
                    soDien[j] = tmp;

                    String tmp2 = chuHo[i];
                    chuHo[i] = chuHo[j];
                    chuHo[j] = tmp2;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp !!!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }
}