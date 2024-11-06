package QL_BanHang;

public class KhachHang {

    protected int id;
    protected String tenKhachHang;
    protected String loaiHangId;

    public KhachHang() {
    }

    public KhachHang(int id, String tenKhachHang, String loaiHangId) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.loaiHangId = loaiHangId;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id=" + id +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", loaiHangId='" + loaiHangId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getLoaiHangId() {
        return loaiHangId;
    }

    public void setLoaiHangId(String loaiHangId) {
        this.loaiHangId = loaiHangId;
    }
}
