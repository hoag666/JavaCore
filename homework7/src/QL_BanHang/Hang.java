package QL_BanHang;

public class Hang {

    protected int id;
    protected String loaiHangId;
    protected String tenHang;
    protected int soLuong;
    protected float donGia;

    public Hang() {
    }

    public Hang(int id, String loaiHangId, String tenHang, int soLuong, float donGia) {
        this.id = id;
        this.loaiHangId = loaiHangId;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Hang{" +
                "id=" + id +
                ", loaiHangId='" + loaiHangId + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaiHangId() {
        return loaiHangId;
    }

    public void setLoaiHangId(String loaiHangId) {
        this.loaiHangId = loaiHangId;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}
