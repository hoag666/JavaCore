package B4;

import java.util.Scanner;

public class Student {
    static class thongTinHocSinh {
        String hoTen;
        int tuoi;
        String gioiTinh;
        String lop;
    }

    public static Student.thongTinHocSinh nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        thongTinHocSinh hocSinh = new Student.thongTinHocSinh();
        System.out.println("Mời bạn nhập họ tên học sinh : ");
        hocSinh.hoTen = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi : ");
        hocSinh.tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập giới tính : ");
        hocSinh.gioiTinh = sc.nextLine();
        System.out.println("Mời bạn nhập lớp : ");
        hocSinh.lop = sc.nextLine();
        return hocSinh;
    }

    public static void hienThiThongTin(thongTinHocSinh hocSinh) {
        System.out.println("----------THÔNG TIN HỌC SINH----------");
        System.out.println("Tên học sinh : " + hocSinh.hoTen);
        System.out.println("Tuổi : " + hocSinh.tuoi);
        System.out.println("Giới tính : " + hocSinh.gioiTinh);
        System.out.println("Tên lớp : " + hocSinh.lop);
    }

    public static void main(String[] args) {
        thongTinHocSinh hocSinh = nhapThongTin();
        hienThiThongTin(hocSinh);
    }
}
