import java.util.Scanner;

public class AmountTotal{  // my guess question 13 is that it is compund interest

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount:");
    int principal  = sc.nextInt();
   double rate =0.003125;
    
  

  
 double amount  = principal * Math.pow( 1+ (rate/12),6);


      
    

System.out.printf(" The account value  is %f%n",amount);

    





    }






}
