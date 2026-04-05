import java.util.Scanner;

public class MetersFeet{

 public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

  System.out.print("Enter the number:");
    int number = sc.nextInt();
  
  double feets = number * 3.2786;
  

 System.out.printf("The answer is %.2f%n",feets);


    }


}
