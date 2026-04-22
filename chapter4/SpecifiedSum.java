import java.util.Scanner;

public class SpecifiedSum{



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= sc.nextInt();

        int sum = 0;
        while (sum < number) {
            System.out.print("Enter a number: ");
              int input= sc.nextInt();
            sum += input;
        }
        System.out.println("Sum reached: " + sum);
    }
}
