package QL_Electronic;

public class Main {

    public static void main(String[] args) {

        MayGiat mayGiat = new MayGiat(200, 100, 50, "2");

        TuLanh tuLanh = new TuLanh(180, 120, 100, 4);

        System.out.println("Thông tin máy giặt");
        System.out.println("------------------");
        mayGiat.xuat();
        System.out.println("==================");
        System.out.println("Thông tin tủ lạnh");
        System.out.println("------------------");
        tuLanh.xuat();

    }
}
