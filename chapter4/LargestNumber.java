import java.util.Scanner;

public class LargestNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        int number;
        int largest;

        

        while (counter < 10) {
            System.out.print("Enter integer ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);
       
    }
}
