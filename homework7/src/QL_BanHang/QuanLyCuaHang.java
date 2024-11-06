package QL_BanHang;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCuaHang {
    protected List<LoaiHang> loaiHangs = new ArrayList<>();
    protected List<KhachHang> khachHangs = new ArrayList<>();
    protected List<Hang> hangs = new ArrayList<>();
    protected GioHang gioHang = new GioHang();

    public void themLoaiHang(LoaiHang loaiHang) {
        loaiHangs.add(loaiHang);
    }

    public void themKhachHang(KhachHang khachHang) {
        khachHangs.add(khachHang);
    }

    public void themHang(Hang hang) {
        hangs.add(hang);
    }

    public void hienThiLoaiHang() {
        System.out.println("Loai hang : ");
        for (LoaiHang loaiHang : loaiHangs) {
            System.out.println(loaiHang);
        }
    }

    public void hienThiKhachHang() {
        System.out.println("Khach hang : ");
        for (KhachHang khachHang : khachHangs) {
            System.out.println(khachHang);
        }
    }

    public void hienThiHang() {
        System.out.println("Hang : ");
        for (Hang hang : hangs) {
            System.out.println(hang);
        }
    }

    public void themVaoGioHang(Hang hang) {
        gioHang.themHang(hang);
    }

    public void hienThiGioHang() {
        gioHang.hienThiGioHang();
    }
}
