    import java.util.Scanner;

public class TriangleChecker{


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the first number:");
double number1 = sc.nextDouble();

System.out.print("Enter the second number:");
double number2 = sc.nextDouble();

System.out.print("Enter the third number:");
double number3 = sc.nextDouble();

if (number1==number2 && number2==number3){

 System.out.print("This is equilateral triangle");

    



} else if (number1 == number2 || number3 == number1 || number2 == number3){

 System.out.print("it is an isoceles triangle");

    



} else {

 System.out.print("it is a scalene Triangle");

    



} 


    









}




}
