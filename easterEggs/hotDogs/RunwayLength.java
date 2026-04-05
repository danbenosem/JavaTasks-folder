import java.util.Scanner;

public class RunwayLength{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the velocity:");
    int velocity = sc.nextInt();
    
  

    System.out.println("Enter the acceleration:");
    int acce = sc.nextInt();

 int length = (velocity*velocity)/(acce);


      
    

System.out.printf(" The distance  is %d %n",length);

    





    }






}
