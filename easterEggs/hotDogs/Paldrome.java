import java.util.Scanner;

public class Paldrome {


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the palindrome integer");
int palin= sc.nextInt();

int digit1 = palin /100;
int digit2= (palin%100) / 10;
int digit3 = (palin%100) % 10 ;

if (digit1 == digit3){
 
    System.out.print("It is a palindrome Integer");


} else{

     System.out.print("It is not a palindrome Integer");
}





}




}
