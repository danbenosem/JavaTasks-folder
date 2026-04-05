import java.util.Scanner;

public class ReadDigits{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an interger");// this one was hard as i had to go and find out about numbering systems(Hundred tense and units)
    int number = sc.nextInt();
    
    int digit1 = number/100;
    int digit2 = (number % 100)/10;
    int digit 3= (number%100)%10;

int finalInteger = digit1 + digit2 + digit3;
    
    
    





    }






}
