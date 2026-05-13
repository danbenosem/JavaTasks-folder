    import java.util.Scanner;

public class KiloConv{

 public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

  System.out.print("Enter the number:");
    int number = sc.nextInt();
  
  double kilometer = number * 1.6;

 System.out.printf("The answer is %.2f%n",kilometer);


    }


}
