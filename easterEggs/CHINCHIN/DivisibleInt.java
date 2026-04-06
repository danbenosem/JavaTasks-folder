import java.util.Scanner;

public class DivisibleInt{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter an Integer:");
    int num1 = sc.nextInt();


if (num1 % 4 ==0  && num1 % 5==0){
    
    System.out.print("It is divisible by both 4 and 5");


} else if (num1 % 4 == 0 || num1 % 5 == 0){
    
    System.out.print("It is divisible by 4 or 5");


} else if (   (num1 % 4  == 0 && num1 % 5 != 0) || (num1 % 4  != 0 && num1 % 5 == 0) ){
    
    System.out.print("It is divisible by both 4 or 5 but not both");


}



    







    


 }


}





