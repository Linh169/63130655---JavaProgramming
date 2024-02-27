import java.util.Scanner;

public class Bai2 {
    public static void PTB2() {
        System.out.println("Nhap a:");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap b:");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Nhap c:");
        float c = new Scanner(System.in).nextFloat();

        if(a==0)
            System.out.println("x = " +(float)(-c/b));
        else {
            double Delta = Math.pow(b,2) - 4*a*c;
            if (Delta <0 )
                System.out.println("PTVN");
            else if(Delta == 0)
                System.out.println("PT có nghiệm kép x = " + (float)(-b/(2*a)));
            else {
                double x1 = (-b + Math.sqrt(Delta))/(2*a);
                double x2 = (-b - Math.sqrt(Delta))/(2*a);
                System.out.println("PT co 2 nghiem pb: x1 = " + x1 + " x2 = "+ x2);
            }
        }
    }
}
