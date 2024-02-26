import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap ten SV: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Nhap diem tb: ");
        double tb = new Scanner(System.in).nextDouble();
        System.out.println("<< " + ten + " >> " + tb + " diem");
    }
}
