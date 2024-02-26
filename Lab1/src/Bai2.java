import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap canh dai: ");
        float dai = new Scanner(System.in).nextFloat();
        System.out.println("Nhap canh rong: ");
        float rong = new Scanner(System.in).nextFloat();

        float cv = ( dai + rong )*2;
        float dt = dai*rong;
        float cnn = Math.min(dai,rong);
        System.out.println("Chu vi: " +cv);
        System.out.println("Dien tich: " +dt);
        System.out.println("Canh nho nhat: " +cnn);
    }
}
