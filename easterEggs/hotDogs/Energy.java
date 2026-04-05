import java.util.Scanner;

public class Energy{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Mass in kg:");
    int num1= sc.nextInt();
    
   System.out.println("Enter the initial temperature:");
    int num2 = sc.nextInt();

    System.out.println("Enter the final temperature:");
    int num3= sc.nextInt();

 int energy= (num1)* (num3-num2) *4184;


      
    

System.out.printf(" The distance  is %d %n",energy);

    





    }






}
