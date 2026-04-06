import java.util.Scanner;

public class ReadThreeDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an digit interger");
    int number = sc.nextInt();
    
    int digit1 = number/100;
    int digit2 = (number % 100)/10;
    int digit 3= (number%100)%10;


if(digit1 == 0 && digit2 == 0 && digit3 != 0 ) {

System.out.print("It is 1 digit integer");


}else if(digit1 != 0 && digit2 ==0 && digit3 == 0 ) {

System.out.print("It is 3 digit integer");

} else if(digit1 == 0 && digit2 !=0 && digit3 == 0 ) {

System.out.print("It is 2 digit integer");

}

    
    
    





    }






}
