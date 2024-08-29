package QL_Electronic;

public class TuLanh extends Electronic {

    protected float dungTich;
    protected int soNgan;

    public TuLanh(float congSuat, float dienAp, float dungTich, int soNgan) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.soNgan = soNgan;
    }

    public void xuat() {
        System.out.println("Công suất (w) : " + congSuat);
        System.out.println("Điện áp (v) : " + dienAp);
        System.out.println("Dung tích (lít) : " + dungTich);
        System.out.println("Số ngăn : " + soNgan);
    }

}