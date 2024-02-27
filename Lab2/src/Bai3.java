import java.util.Scanner;

public class Bai3 {
    public static void tienDien() {
        System.out.println("Nhap tien dien: ");
        double soDien = new Scanner(System.in).nextDouble();
        if(soDien <= 50)
            System.out.println("Tien dien la: " + soDien*1000);
        else
            System.out.println("Tien dien la: " + (50*1000 + (soDien-50)*1200));
    }
}
