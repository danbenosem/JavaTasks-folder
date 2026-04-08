import java.util.Scanner;

public class DateThreeDigit{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a three digit interger");
    int digit1 = sc.nextInt();

    System.out.print("Enter a three digit interger");
    int digit2 = sc.nextInt();

   System.out.print("Enter a three digit interger");
    int digit3 = sc.nextInt();
    
    



if (digit1 >31){


    System.out.print("Invalid date");

} else if (digit2>12 ){
    
     System.out.print("Invalid month");


}  else if (digit3/1000 < 0 ){
    
     System.out.print(" invalid year");


}


System.out.printf("%d:%d:%d",digit1,digit2,digit3);

  



    
    
    





    }






}
