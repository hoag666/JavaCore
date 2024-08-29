package QL_Electronic;

public class MayGiat extends Electronic {

    protected float dungTich;
    protected String loai;

    public MayGiat(float congSuat, float dienAp, float dungTich, String loai) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.loai = loai;
    }

    public void xuat() {
        System.out.println("Công suất (w) : " + congSuat);
        System.out.println("Điện áp (v) : " + dienAp);
        System.out.println("Dung tích (kg) : " + dungTich);
        System.out.println("Loại : " + loai);
    }
}
