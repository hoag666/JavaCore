package QL_BanHang;

public class LoaiHang {

    protected int id;
    protected String tenLoai;

    public LoaiHang() {
    }

    public LoaiHang(int id, String tenLoai) {
        this.id = id;
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiHang{" +
                "id=" + id +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
