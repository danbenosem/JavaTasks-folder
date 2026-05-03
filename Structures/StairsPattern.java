import java.util.Scanner;

public class StairsPattern {

    
    public static void displayPattern(int number) {

        for (int row = 1; row <= number; row++) {

            
            for (int column = 1; column <= row; column++) {

                System.out.print(column+ " ");

            }
            
            System.out.println();
        }
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of rows for the pattern: ");

        int rows = input.nextInt();
        
        displayPattern(rows);
        
    }
}
