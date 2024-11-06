package QL_BanHang;

public class Main {
    public static void main(String[] args) {
        QuanLyCuaHang quanLy = new QuanLyCuaHang();

        LoaiHang loai1 = new LoaiHang(1, "Điện tử");
        LoaiHang loai2 = new LoaiHang(2, "Quần áo");
        LoaiHang loai3 = new LoaiHang(3, "Giay dep");
        quanLy.themLoaiHang(loai1);
        quanLy.themLoaiHang(loai2);
        quanLy.themLoaiHang(loai3);

        KhachHang kh1 = new KhachHang(1, "Nguyen Ba Viet Hoang", "1");
        KhachHang kh2 = new KhachHang(2, "Vu Duc Dung", "2");
        KhachHang kh3 = new KhachHang(3, "Nguyen Quoc Cuong", "3");
        KhachHang kh4 = new KhachHang(4, "Pham Truong", "4");
        quanLy.themKhachHang(kh1);
        quanLy.themKhachHang(kh2);
        quanLy.themKhachHang(kh3);
        quanLy.themKhachHang(kh4);

        Hang hang1 = new Hang(1, "1", "Laptop", 10, 12000000);
        Hang hang2 = new Hang(2, "2", "Ao", 50, 200000);
        Hang hang3 = new Hang(3, "2", "Quan dsq2", 500, 400000);
        Hang hang4 = new Hang(4, "3", "Giay dep lv", 345, 205000);
        quanLy.themHang(hang1);
        quanLy.themHang(hang2);
        quanLy.themHang(hang3);
        quanLy.themHang(hang4);

        quanLy.hienThiLoaiHang();
        quanLy.hienThiKhachHang();
        quanLy.hienThiHang();

        quanLy.themVaoGioHang(hang1);
        quanLy.themVaoGioHang(hang2);
        quanLy.themVaoGioHang(hang3);
        quanLy.themVaoGioHang(hang4);
        quanLy.hienThiGioHang();
    }
}

