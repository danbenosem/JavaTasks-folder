import java.util.Scanner;

public class DisplaySorted{


    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter the first number: ");

            double num1 = input.nextDouble();

         System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

         System.out.print("Enter the third number: ");
            double num3 = input.nextDouble();
            
            displaySortedNumbers(num1, num2, num3);
            
        }

    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        
        System.out.print("Numbers in decreasing order: ");
        
        
        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } 
        
        else if (num1 >= num3 && num3 >= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } 
        
        else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } 
        
        else if (num2 >= num3 && num3 >= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } 
        
        else if (num3 >= num1 && num1 >= num2) {
            System.out.println(num3 + " " + num1 + "" + num2);
        } 
        
        else{
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }

    
    
}
