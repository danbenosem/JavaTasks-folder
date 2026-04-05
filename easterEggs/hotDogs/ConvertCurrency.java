import java.util.Scanner;

public class ConvertCurrency {


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("This is a program to convert from us dollar to chinese Rmb"); // based on research 1 us dollar = 6.88
System.out.print("Enter 0 to convert from dollar to chinese rmb or 1 to convert from chinese rmb to dollar:");
int firstInt= sc.nextInt();

if (firstInt== 1){

 System.out.print("Enter the amount to be converted:");
   double secondInt= sc.nextDouble();
    double formular= secondInt * 6.88;

    System.out.printf("The new value is %f%n",formular);

    



} else if (firstInt== 0){

 System.out.print("Enter the amount to be converted:");
   double secondInt= sc.nextDouble();
    double formular= secondInt / 6.88;

    System.out.printf("The new value is %f%n",formular);

    



} else {
  System.out.print("ERROR !!!!");
}






}




}
