import java.util.Scanner;


public class Bai4 {

    public static void main(String[] args) {
            System.out.println("+-------------------------------+");
            System.out.println("1. PT bậc nhất");
            System.out.println("2. PT bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            int a;
            do {
                System.out.println("___Chọn chức năng: ");
                a = new Scanner(System.in).nextInt();
                switch (a){
                    case 1:
                        Bai1.PTB1();
                        break;
                    case 2:
                        Bai2.PTB2();
                        break;
                    case 3:
                        Bai3.tienDien();
                        break;

                }
            }while (a>=4);
    }

}
