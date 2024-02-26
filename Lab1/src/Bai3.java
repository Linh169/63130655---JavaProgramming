import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap canh lap phuong: ");
        float x = new Scanner(System.in).nextFloat();
        System.out.println("The tich lap phuong (canh * canh* canh): " + x*x*x);
        System.out.println("Hoac Math.pow(canh,3):" + Math.pow(x,3));
    }
}
