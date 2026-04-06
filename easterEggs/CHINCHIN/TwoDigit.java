import java.util.Scanner;

public class TwoDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a two digit interger");
    int number = sc.nextInt();
    
   
    int digit1 = number/10;
    int digit2 = number%10;
 
 if( digit1>digit2){
 System.out.print("The tens is bigger");


} else  if( digit1<digit2){
 System.out.print("The tens is lesser");


}   if( digit1==digit2){
 System.out.print("The tens equal to units");


}
    
    











    }






}
