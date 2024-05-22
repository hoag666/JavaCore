package B4;

import java.util.Scanner;

public class BieuThuc {
    public static double bieuThuc(int a, int b, float x) {
        return a / 10 + Math.pow(a, b) - ((Math.sin((Math.PI * x) / 3)) / Math.sqrt(Math.pow(a + b, 2) + 5) + Math.log(Math.pow(a, 2) + 1) - (Math.log(Math.pow(4 * x, 2 * a) + 3) / 2.55));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        float x;
        System.out.println("Mời bạn nhập a : ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập b : ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập x : ");
        x = Float.parseFloat(sc.nextLine());
        double ketQua;
        ketQua = bieuThuc(a, b, x);
        System.out.println("Kết quả của biểu thức là : " + ketQua);
    }
}
