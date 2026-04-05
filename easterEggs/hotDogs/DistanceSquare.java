import java.util.Scanner;

public class DistanceSquare{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x1 :");
    double num1= sc.nextDouble();
    
   System.out.println("Enter the value of y1:");
    double num2= sc.nextDouble();

    System.out.println("Enter the value of x2:");
  double num3= sc.nextDouble();

  System.out.println("Enter the value of y2:");
   double num4= sc.nextDouble();

 double distance = (Math.pow(Math.pow((num3-num1),2),0.5) +  Math.pow((num4-num2),2))/ Math.pow(Math.pow((num3-num1),2) +  Math.pow((num4-num2),2),0.5);


      
    

System.out.printf(" The distance  is %f %n",distance);

    





    }






}
