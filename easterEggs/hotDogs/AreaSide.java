import java.util.Scanner;

public class AreaSide{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of side 1:");
    double num1= sc.nextDouble();
    
   System.out.println("Enter the value of side 2:");
    double num2= sc.nextDouble();

    System.out.println("Enter the value of side 3:");
  double num3= sc.nextDouble();

double sideo = (num1 +num2 +num3)/2;

double area= Math.pow((sideo*(sideo-num1)*(sideo-num2)*(sideo-num3)),0.5);









      
    

System.out.printf(" The area  is %f %n",area);

    





    }






}
