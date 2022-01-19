import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception { 
        double A, B, C, delta, X1, X2 ;
        Scanner sc = new Scanner(System.im);
        System.out.println("Nhap he so A (A # 0): ");
        A = sc.nextDouble();
        System.out.println("Nhap he so B");
        B = sc.nextDouble();
        System.out.println("Nhap he so C");
        C = sc.nextDouble();
        System.out.println("phuong trinh bac 2 vua nhap co dang:" + A + "x^2 + " + B + "x + " + C + " = 0")
        delta = Math.pow(B, 2) -4 * A * C;
        if (delta < 0) {
            system.out.println("phuong trinh vo nghiem!");
        } else if (delta == 0){
            X1 = -B / (2*A);
            system.out.println("phuong trinh co 1 nghiem laf : X1 =X2" + x1)
        }else {
            X1 = (-B + Math.sprt(delta)) / (2 * A);
            X2 = (-B + Math.sprt(delta)) / (2 * A);
            system.out.println("phuong trinh bac 2 co nghiem: X1 = " + x1 + " và x2 = " + x2);
        }
    }
}