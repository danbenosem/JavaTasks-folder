import java.util.Scanner;

public class VolumePrism{

 public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

  System.out.print("Enter the length of side:");
    int number = sc.nextInt();
  
  double area = (Math.sqrt(3)/4)*(number*number) ;

    double volume = area * number;

 System.out.printf("The answer is %.2f%n",volume);


    }


}
