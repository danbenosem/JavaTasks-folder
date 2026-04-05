import java.util.Scanner;

public class MetersPing{

 public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

  System.out.print("Enter the number:");
    int number = sc.nextInt();
  
  double ping = number * 0.3025;
  

 System.out.printf("The answer is %.2f%n",ping);


    }


}
