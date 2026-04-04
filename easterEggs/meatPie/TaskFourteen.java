import java.util.Scanner;

public class TaskFourteen {

    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number:");
    int number = sc.nextInt();

    System.out.print("Enter the Second number:");
    int number2 = sc.nextInt();
    
    System.out.print("Enter the Third number:");
    int number3 = sc.nextInt();

    int average= (number+number2+number3)/3;



   
System.out.printf("The average numbers are %d %n",average);

}




}
