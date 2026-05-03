import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");

        double side1 = input.nextDouble();

  System.out.print("Enter the second side: ");
        double side2 = input.nextDouble();

  System.out.print("Enter third side: ");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println("The area is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid triangle");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
    
    if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
        return true;  
    } else {
        return false; 
    }
}
    public static double area(double side1, double side2, double side3) {
        // Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
