import java.util.Scanner;

public class App35 {
    public static void main(String[] args){
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        secondNumber = scanner.nextInt();

        int minNumber = firstNumber;
        if (firstNumber > secondNumber)
             minNumber = secondNumber;
             System.out.println("So nho nhat trong 2 so " + firstNumber + " va "
             + secondNumber+ " la " + minNumber);
    }
            
}
