import java.util.Scanner;

public class Factorial{


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int factorial = 1;
        for (int num = 1; num<= number; num++) {
            factorial *= num;
        }

        System.out.println(factorial);
    }
}
