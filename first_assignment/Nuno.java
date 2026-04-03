import java.util.Scanner;
public class Nuno{

    public static void main(String [] args){
        
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the first number:");
    int number1 = sc.nextInt();

    System.out.print("What is the second number:");
    int number2 = sc.nextInt();

    int product = number1*number2;

    if (number1>number2){
    
   System.out.printf("%d is the largest number",number1);

  }
   else if(number1<number2){

     System.out.printf("%d is the largest number",number1);
}


    
    }


}
