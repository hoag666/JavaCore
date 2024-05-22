package B4;

import java.util.Scanner;

public class HinhThang {
    public static double tinhDienTich(double dayLon, double dayNho, double chieuCao) {
        return ((dayLon + dayNho) * chieuCao) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dayLon;
        double dayNho;
        double chieuCao;
        System.out.println("Mời bạn nhập đáy lớn của hình thang : ");
        dayLon = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập đáy nhỏ của hình thang : ");
        dayNho = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập chiều cao của hình thang : ");
        chieuCao = Double.parseDouble(sc.nextLine());
        double dienTich;
        dienTich = tinhDienTich(dayLon, dayNho, chieuCao);
        System.out.println("Diện tích của hình thang là : " + dienTich);
    }
}

