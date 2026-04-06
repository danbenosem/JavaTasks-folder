import java.util.Scanner;

public class DoublesDisplay{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the first number:");
    double num1 = sc.nextDouble();

    System.out.print("Enter the second Number:");
    double num2 = sc.nextDouble();

     
if ( num1> num2){

System.out.print("The first number is bigger");

double sum = num1 + num2;
double minus = num1 - num2;
double quo= num1 - num2;
System.out.printf("sum:%d%n, diffrence:%d%n , quotient:%d%n", sum, minus,quo);

}else if ( num2> num1){

System.out.print("The second number is bigger");


double sum = num2 + num1;
double minus = num2 - num1;
double quo= num2 - num1;

System.out.printf("sum:%d%n, diffrence:%d%n , quotient:%d%n", sum, minus,quo);
}









    


 }


}





