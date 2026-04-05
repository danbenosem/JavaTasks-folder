import java.util.Scanner;

public class Bmi{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weight in pounds:");
    double num1= sc.nextDouble();
    
   System.out.println("Enter the height in inches:");
    double num2 = sc.nextDouble();

  

 double bmi = (num1*0.45359237)/(num2*0.0254) ;


      
    

System.out.printf(" The Bmi  is %f %n",bmi);

    





    }






}
