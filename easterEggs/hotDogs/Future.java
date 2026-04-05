import java.util.Scanner;

public class Future{ 

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the investment amount:");
    double principal  = sc.nextDouble();

     System.out.println("Enter the rate:");
    Double rate  = sc.nextDouble();

   System.out.println("Enter the number of years:");
    int years  = sc.nextInt();
    
  

  
 double Future = principal * Math.pow( 1+rate),(years*12));


      
    

System.out.printf(" The Future value investment  is %f%n",Future);

    





    }






}
