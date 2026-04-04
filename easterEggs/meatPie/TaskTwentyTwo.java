import java.util.Scanner;

public class TaskTwentyTwo{

    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius:");
    int number1 = sc.nextInt();

   

   double area = number1 * number1* 2 * 3.142;

   System.out.printf("The area is %.2f%n",area);

}




}
