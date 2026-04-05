import java.util.Scanner;

public class CostTrip{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the distance to drive:");
    int num1= sc.nextInt();
    
   System.out.println("Entee the  fuel efficiency per gallon in miles:");
    int num2 = sc.nextInt();

    System.out.println("Enter the price:");
    int num3= sc.nextInt();

 int cost= (num1/num2) *num3;


      
    

System.out.printf(" The distance  is %d %n",cost);

    





    }






}
