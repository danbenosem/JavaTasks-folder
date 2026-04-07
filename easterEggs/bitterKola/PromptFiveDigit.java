import java.util.Scanner;

public class PromptFiveDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 4 digit interger");
    int number = sc.nextInt();

   
    int digit1 = number/10000;
    int digit2 = (number % 10000)/1000;
    int digit3= ((number%10000)%1000)/100;
    int digit4 = (((number%10000)%1000)%100)/10;
    int digit5 = ( ((number%10000)%1000)%100)%10;

int formu = digit5 -digit1;

System.out.print(formu);
    
    





    }






}
