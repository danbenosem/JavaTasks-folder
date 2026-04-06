import java.util.Scanner;

public class PromptThreeDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a three digit interger");
    int number = sc.nextInt();
    
    int digit1 = number/100;
    int digit2 = (number % 100)/10;
    int digit 3= (number%100)%10;

int finalInteger = digit1 + digit2 + digit3;
    
    
    





    }






}
