import java.util.Scanner;

public class TaskThirty {

    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number:");
    int number = sc.nextInt();

    System.out.print("Enter the Second number:");
    int number2 = sc.nextInt();

    int sum= number + number2;
    int product = number * number2;


   
System.out.printf("The  numbers are %d,%d%n",sum,product);

}




}
