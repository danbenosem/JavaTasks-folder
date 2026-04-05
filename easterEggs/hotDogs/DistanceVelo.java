import java.util.Scanner;

public class DistanceVelo{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the velocity:");
    int velocity = sc.nextInt();
    
   System.out.println("Enter the time:");
    int time = sc.nextInt();

    System.out.println("Enter the acceleration:");
    int acce = sc.nextInt();

 int distance = (velocity*time) + ((acce*time*time)/2);


      
    

System.out.printf(" The remaining distance  is %d %n",distance);

    





    }






}
