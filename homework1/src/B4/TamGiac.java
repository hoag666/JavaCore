package B4;

import java.util.Scanner;

public class TamGiac {
    public static double tinhChuVi(double canhA, double canhB, double canhC) {
        return canhA + canhB + canhC;
    }

    public static double tinhDienTich(double canhA, double canhB, double canhC) {
        double p = (canhA + canhB + canhC) / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canhA;
        double canhB;
        double canhC;
        System.out.println("Mời bạn nhập độ dài của ba cạnh tam giác");
        System.out.println("Mời bạn nhập cạnh a : ");
        canhA = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh b : ");
        canhB = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh c : ");
        canhC = Double.parseDouble(sc.nextLine());
        if (canhA + canhB > canhC && canhB + canhC > canhA && canhC + canhA > canhB) {
            double chuVi;
            double dienTich;
            chuVi = tinhChuVi(canhA, canhB, canhC);
            System.out.println("Chu vi của tam giác là : " + chuVi);
            dienTich = tinhDienTich(canhA, canhB, canhC);
            System.out.println("Diện tích của tam giác là : " + dienTich);
        } else {
            System.out.println("Ba cạnh vừa nhập không phải là cạnh của tam giác");
        }
    }
}
