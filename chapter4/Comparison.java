import java.util.Scanner;

public class Comparison {
        public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        double firstNum= sc.nextDouble();
        System.out.print("Enter second number: ");
        double secondNum = sc.nextDouble();

        if (firstNum == secondNum)
            System.out.println(0);
        else if (firstNum > secondNum)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
