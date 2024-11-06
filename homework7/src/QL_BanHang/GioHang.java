package QL_BanHang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    protected List<Hang> hangs = new ArrayList<>();

    public void themHang(Hang hang){
        hangs.add(hang);
    }

    public void hienThiGioHang(){
        System.out.println("Gio hang : ");
        for (Hang hang : hangs){
            System.out.println(hang);
        }
    }
}