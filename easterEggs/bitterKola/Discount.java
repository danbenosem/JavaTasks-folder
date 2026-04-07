import java.util.Scanner;

public class Discount{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a price");
    double num1 = sc.nextDouble();

    System.out.print("Enter a discount");
    double num2 = sc.nextDouble();
    
double disAmonut = num1 * (num2/100) ;
double price = num1 - disAmount;

System.out.printf("final price:%f",price);
    
    





    }






}
