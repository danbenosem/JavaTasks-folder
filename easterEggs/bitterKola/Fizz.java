import java.util.Scanner;

public class Fizz{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer :");
    int num1= sc.nextInt();
    
   

 

 if (num1 % 5== 0){

System.out.printf("buzz");


} else if (num1 % 3== 0){

System.out.printf(" fizz");


} else if ( (num1 % 5== 0 &&   num1 % 3== 0)   ||  (num1 % 5!= 0 &&   num1 % 3 != 0 ){

System.out.printf("FizzBuzz");


}


      
    



    





    }






}
