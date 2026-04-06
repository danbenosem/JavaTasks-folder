import java.security.SecureRandom;
import java.util.Scanner;


public class Lottery{
public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();


int gen = random.nextInt(90)+10;

System.out.print("Enter a two digit Number:");
int number = sc.nextInt();

int genDigit1= gen /10;
int genDigit2= gen % 10;

int numDigit1= number /10;
int numDigit2= number % 10




if (number == gen){

    System.out.print("You win $10,100");


}  else if (    (numDigit1==genDigit1 || numDigit1 == genDigit2) && (numDigit2==genDigit1 || numDigit2 == genDigit2)    ){

        System.out.print("You win $3000");

} else if (    (numDigit1==genDigit1 || numDigit1 == genDigit2) || (numDigit2==genDigit1 || numDigit2 == genDigit2)    ){

        System.out.print("You win $1000");

} 






}

}
