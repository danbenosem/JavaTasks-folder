import java.util.Scanner;

public class TaskTwentyOne{

    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the base:");
    int number1 = sc.nextInt();

    System.out.print("Enter the height:");
    int number2 = sc.nextInt();

   double area = number1 * number2 * 0.5;

   System.out.printf("The area is %.2f%n",area);

}




}
