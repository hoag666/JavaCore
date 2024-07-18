package B7;

import java.util.Scanner;

public class QuanLyCuTa {

    static Scanner sc = new Scanner(System.in);

    static String[] hoTen = new String[]{
            "Nguyen Ba Viet Hoang", "Vu Duc Dung", "Nguyen Quoc Cuong", "Dao Duy Anh",
            "Nguyen Duy Hung", "Do Quang Hao", "Tran Van Truong"
    };

    static int[] lan1 = new int[]{
            150, 160, 200, 140, 130, 190, 190
    };

    static int[] lan2 = new int[]{
            160, 140, 130, 190, 200, 170, 170
    };

    static int[] lan3 = new int[]{
            180, 160, 140, 200, 120, 190, 190
    };

    static int[] sum = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < hoTen.length; i++) {
            sum[i] = lan1[i] + lan2[i] + lan3[i];
        }

        int choose;

        do {
            System.out.println("==============================================");
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1. Hiển thị danh sách vận động viên");
            System.out.println("2. Hiển thị thông tin về vận động viên có tổng thành tích cao nhất");
            System.out.println("3. Hiển thị 3 vận động viên có tổng thành tích cao nhất");
            System.out.println("4. Sắp xếp danh sách vận động viên theo tên");
            System.out.println("5. Hiển thị danh sách có vận động viên bắt đầu bằng chữ \"T\".");
            System.out.println("6. Hiển thị danh sách vận động viên tên có vần \"an\".");
            System.out.println("7. Sắp xếp danh sách vận động viên theo chiều dài của tên tăng dần");
            System.out.println("8. Hiển thị danh sách các vận động viên có cùng tổng thành tích");
            System.out.println("9. Hiển thị danh sách các vận động viên có lần cử tạ thứ 3 thấp nhất");
            System.out.println("10. Hiển thị danh sách các vận động viên có lần cử tạ thứ 1 cao nhất");
            System.out.println("0. Thoát !!!");
            System.out.print("Chọn : ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }

            switch (choose) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showTop1(1);
                    break;
                case 3:
                    showTop3(3);
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    showFillName();
                    break;
                case 6:
                    showFillName2("an");
                    break;
                case 7:
                    sortByNameAZ();
                    break;
                case 8:
                    bangNhau();
                    break;
                case 9:
                    hienThiLan3ThapNhat();
                    break;
                case 10:
                    hienThiLan1CaoNhat();
                    break;
                case 0:
                    System.out.println("Thoát...!!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }

        } while (choose != 0);

    }

    private static void showAll() {
        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTen[i], lan1[i], lan2[i], lan3[i], sum[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showTop1(int top) {

        String[] hoTenTmp = hoTen.clone();
        int[] sumTmp = sum.clone();
        int[] lan1Tmp = lan1.clone();
        int[] lan2Tmp = lan2.clone();
        int[] lan3Tmp = lan3.clone();

        for (int i = 0; i < lan1Tmp.length; i++) {
            sumTmp[i] = lan1Tmp[i] + lan2Tmp[i] + lan3Tmp[i];
        }

        for (int i = 0; i < hoTenTmp.length - 1; i++) {
            for (int j = i + 1; j < hoTenTmp.length; j++) {
                if (sumTmp[i] < sumTmp[j]) {
                    int tmp = sumTmp[i];
                    sumTmp[i] = sumTmp[j];
                    sumTmp[j] = tmp;

                    String tmp2 = hoTenTmp[i];
                    hoTenTmp[i] = hoTenTmp[j];
                    hoTenTmp[j] = tmp2;

                    int tmp1 = lan1Tmp[i];
                    lan1Tmp[i] = lan1Tmp[j];
                    lan1Tmp[j] = tmp1;

                    int tmp4 = lan2Tmp[i];
                    lan2Tmp[i] = lan2Tmp[j];
                    lan2Tmp[j] = tmp4;

                    int tmp3 = lan3Tmp[i];
                    lan3Tmp[i] = lan3Tmp[j];
                    lan3Tmp[j] = tmp3;
                }
            }
        }
        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("-------------------------------- TỔNG THÀNH TÍCH CAO NHẤT -------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));

        int n = top;
        if (top > hoTenTmp.length) {
            n = hoTenTmp.length;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTenTmp[i], lan1Tmp[i], lan2Tmp[i], lan3Tmp[i], sumTmp[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showTop3(int top) {
        String[] hoTenTmp = hoTen.clone();
        int[] sumTmp = sum.clone();
        int[] lan1Tmp = lan1.clone();
        int[] lan2Tmp = lan2.clone();
        int[] lan3Tmp = lan3.clone();

        for (int i = 0; i < lan1Tmp.length; i++) {
            sumTmp[i] = lan1Tmp[i] + lan2Tmp[i] + lan3Tmp[i];
        }

        for (int i = 0; i < hoTenTmp.length - 1; i++) {
            for (int j = i + 1; j < hoTenTmp.length; j++) {
                if (sumTmp[i] < sumTmp[j]) {
                    int tmp = sumTmp[i];
                    sumTmp[i] = sumTmp[j];
                    sumTmp[j] = tmp;

                    String tmp2 = hoTenTmp[i];
                    hoTenTmp[i] = hoTenTmp[j];
                    hoTenTmp[j] = tmp2;

                    int tmp1 = lan1Tmp[i];
                    lan1Tmp[i] = lan1Tmp[j];
                    lan1Tmp[j] = tmp1;

                    int tmp4 = lan2Tmp[i];
                    lan2Tmp[i] = lan2Tmp[j];
                    lan2Tmp[j] = tmp4;

                    int tmp3 = lan3Tmp[i];
                    lan3Tmp[i] = lan3Tmp[j];
                    lan3Tmp[j] = tmp3;
                }
            }
        }
        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("--------------------- TOP VẬN ĐÔNG VIÊN CÓ TỔNG THÀNH TÍCH CAO NHẤT ---------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));

        int n = top;
        if (top > hoTen.length) {
            n = hoTen.length;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTenTmp[i], lan1Tmp[i], lan2Tmp[i], lan3Tmp[i], sumTmp[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void sortByName() {

        for (int i = 0; i < hoTen.length - 1; i++) {
            for (int j = i + 1; j < hoTen.length; j++) {
                if (hoTen[i].compareTo(hoTen[j]) > 0) {
                    String tmp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmp;

                    int tmp1 = lan1[i];
                    lan1[i] = lan1[j];
                    lan1[j] = tmp1;

                    int tmp2 = lan2[i];
                    lan2[i] = lan2[j];
                    lan2[j] = tmp2;

                    int tmp3 = lan3[i];
                    lan3[i] = lan3[j];
                    lan3[j] = tmp3;

                    int tmp4 = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp4;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showFillName() {

        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("----------------------------- TÊN VẬN ĐỘNG VIÊN CÓ VẦN \"T\"-----------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < hoTen.length; i++) {
            int index = hoTen[i].lastIndexOf(" ");
            if (hoTen[i].charAt(index + 1) == 'T' || hoTen[i].charAt(index + 1) == 't') {
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTen[i], lan1[i], lan2[i], lan3[i], sum[i]));
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showFillName2(String name) {

        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("---------------------------- TÊN VẬN ĐỘNG VIÊN CÓ VẦN \"an\"-----------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTen[i], lan1[i], lan2[i], lan3[i], sum[i]));
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void sortByNameAZ() {

        for (int i = 0; i < hoTen.length - 1; i++) {
            for (int j = i + 1; j < hoTen.length; j++) {
                if (hoTen[i].length() > hoTen[j].length()) {

                    String tmp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmp;

                    int tmp1 = lan1[i];
                    lan1[i] = lan1[j];
                    lan1[j] = tmp1;

                    int tmp2 = lan2[i];
                    lan2[i] = lan2[j];
                    lan2[j] = tmp2;

                    int tmp3 = lan3[i];
                    lan3[i] = lan3[j];
                    lan3[j] = tmp3;

                    int tmp4 = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp4;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void bangNhau() {
        for (int i = 0; i < hoTen.length - 1; i++) {
            for (int j = i + 1; j < hoTen.length; j++) {
                if (sum[i] < sum[j]) {
                    String tmp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmp;

                    int tmp1 = lan1[i];
                    lan1[i] = lan1[j];
                    lan1[j] = tmp1;

                    int tmp2 = lan2[i];
                    lan2[i] = lan2[j];
                    lan2[j] = tmp2;

                    int tmp3 = lan3[i];
                    lan3[i] = lan3[j];
                    lan3[j] = tmp3;

                    int tmp4 = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp4;
                }
            }
        }
        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("---------------------------- VẬN ĐỘNG VIÊN CÓ CÙNG TỔNG THÀNH TÍCH ----------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTen[i], lan1[i], lan2[i], lan3[i], sum[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void hienThiLan3ThapNhat() {

        String[] hoTenTmp = hoTen.clone();
        int[] lan3Tmp = lan3.clone();
        int[] lan1Tmp = lan1.clone();
        int[] lan2Tmp = lan2.clone();
        int[] sumTmp = sum.clone();

        for (int i = 0; i < hoTenTmp.length - 1; i++) {
            for (int j = i + 1; j < hoTenTmp.length; j++) {
                if (lan3Tmp[i] > lan3Tmp[j]) {
                    int tmp = lan3Tmp[i];
                    lan3Tmp[i] = lan3Tmp[j];
                    lan3Tmp[j] = tmp;

                    String tmp1 = hoTenTmp[i];
                    hoTenTmp[i] = hoTenTmp[j];
                    hoTenTmp[j] = tmp1;

                    int tmp2 = lan2Tmp[i];
                    lan2Tmp[i] = lan2Tmp[j];
                    lan2Tmp[j] = tmp2;

                    int tmp3 = lan1Tmp[i];
                    lan1Tmp[i] = lan1Tmp[j];
                    lan1Tmp[j] = tmp3;

                    int tmp4 = sumTmp[i];
                    sumTmp[i] = sumTmp[j];
                    sumTmp[j] = tmp4;
                }
            }
        }

        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("-------------------------------- CỬ TẠ LẦN 3 THẤP NHẤT ----------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < 1; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTenTmp[i], lan1Tmp[i], lan2Tmp[i], lan3Tmp[i], sumTmp[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void hienThiLan1CaoNhat() {

        String[] hoTenTmp = hoTen.clone();
        int[] lan1Tmp = lan1.clone();
        int[] lan2Tmp = lan2.clone();
        int[] lan3Tmp = lan3.clone();
        int[] sumTmp = sum.clone();
        for (int i = 0; i < hoTenTmp.length - 1; i++) {
            for (int j = i + 1; j < hoTenTmp.length; j++) {
                if (lan1Tmp[i] < lan1Tmp[j]) {
                    int tmp = lan1Tmp[i];
                    lan1Tmp[i] = lan1Tmp[j];
                    lan1Tmp[j] = tmp;

                    String tmp1 = hoTenTmp[i];
                    hoTenTmp[i] = hoTenTmp[j];
                    hoTenTmp[j] = tmp1;

                    int tmp2 = lan2Tmp[i];
                    lan2Tmp[i] = lan2Tmp[j];
                    lan2Tmp[j] = tmp2;

                    int tmp3 = lan3Tmp[i];
                    lan3Tmp[i] = lan3Tmp[j];
                    lan3Tmp[j] = tmp3;

                    int tmp4 = sumTmp[i];
                    sumTmp[i] = sumTmp[j];
                    sumTmp[j] = tmp4;
                }
            }
        }
        System.out.println("====================================== DANH SÁCH ==========================================================");
        System.out.println("--------------------------------- CỬ TẠ LẦN 1 CAO NHẤT ----------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "HỌ TÊN VẬN ĐỘNG VIÊN", "Lần 1", "Lần 2", "Lần 3", "Tổng Thành Tích"));
        for (int i = 0; i < 1; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s | %-30s | %10d | %15s | %15s | %15s |", i + 1, hoTenTmp[i], lan1Tmp[i], lan2Tmp[i], lan3Tmp[i], sumTmp[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
        sc.nextLine();
    }
}