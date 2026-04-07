import java.util.Scanner;

public class PinFourDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 4 digit interger");
    int number = sc.nextInt();
    
    int digit1 = number/1000;
    int digit2 = (number % 1000)/100;
    int digit3= ((number%1000)%100)/10;
    int digit4 = ((number%1000)%100)%10;


if (digit1==0){

    System.out.print("Invalid pin");


}else {

System.out.print("Valid pin");
}


    
    





    }






}
