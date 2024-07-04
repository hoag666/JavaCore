package B1;

public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------- Bảng Cửu Chương -------------------- ");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(j + " x " + i + " = " + (i * j) + "\t\t\t");
            }
            System.out.println();
        }
    }
}
