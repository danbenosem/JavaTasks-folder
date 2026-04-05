import java.util.Scanner;

public class SubtotalGratuity{

 public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

  System.out.print("Enter the subtotal number:");
    int number1 = sc.nextInt();

   System.out.print("Enter the gratuity rate number:");
    int number2 = sc.nextInt();
    
    double rate = (number2 /10)+0.2;
  
  double subtotal = number1 + rate;
  

 System.out.printf("The answers are $%.1f%n $%.1f",rate,subtotal);


    }


}
