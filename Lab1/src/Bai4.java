import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Nhap c: ");
        float c = new Scanner(System.in).nextFloat();

        double Delta = Math.pow(b,2) - 4*a*c;
        double CanDelta = Math.sqrt(Delta);

        System.out.println("Delta = " +Delta + " Can Delta =" +CanDelta);
    }
}
