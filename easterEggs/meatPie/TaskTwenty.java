import java.util.Scanner;

public class TaskTwenty {

    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Length:");
    int number1 = sc.nextInt();

    System.out.print("Enter the width:");
    int number2 = sc.nextInt();

   int area = number1 * number2;

System.out.printf("The area is %d%n",area);

}




}
