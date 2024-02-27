import java.util.Scanner;


public class Bai1 {
    public static void PTB1() {
        System.out.println("Nhap a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap b: ");
        float b = new Scanner(System.in).nextFloat();
            if(a==0){
                if(b==0) System.out.println("VSN");
                else System.out.println("VN");
            }
            else
                System.out.println("Nghiem PT x = " + (-b/a));
    }
}
