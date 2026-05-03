import java.util.Scanner;
import java.util.Random; 


public class PrintMatrix {

    

    public static void main(String[] args) {
      
   
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n for the matrix size: ");
        int number = input.nextInt();
        
        printMatrix(number);
    }

    public static void printMatrix(int number) {

            Random rand = new Random();
        
        for (int row  = 0; row < number; row++) {
           
            for (int column = 0; column< number; column++) {
               
                int randomNum = rand.nextInt(2); 
                System.out.print(randomNum + " ");
            }
            System.out.println(); 
        }
    }
}
