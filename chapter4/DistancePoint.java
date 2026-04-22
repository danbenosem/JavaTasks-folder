import java.util.Scanner;

public class DistancePoint {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");

        
        double x1 = sc.nextDouble();

      System.out.print("Enter  y1: ");
      double y1 = sc.nextDouble();


        System.out.print("Enter x2 : ");
        double x2 = sc.nextDouble()

 System.out.print("Enter  y2: ");

double y2 = sc.nextDouble();

        if (x1 == x2)
            System.out.println("Point will lie on a line perpendicular to the x-axis.");
        else if (y1 == y2)
            System.out.println("it will  lie on a line perpendicular to the y-axis.");
        else
            System.out.println("they  not perpendicular to either axis.");
    }
}
