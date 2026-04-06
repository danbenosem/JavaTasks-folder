import java.util.Scanner;

public class PromptFourDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 4 digit interger");
    int number = sc.nextInt();
    
    int digit1 = number/1000;
    int digit2 = (number % 1000)/100;
    int digit3= ((number%1000)%100)/10;
    int digit4 = ((number%1000)%100)%10;

System.out.printf("the reverse is %d%d%d%d",digit4,digit3,digit2,digit1);
    
    





    }






}
