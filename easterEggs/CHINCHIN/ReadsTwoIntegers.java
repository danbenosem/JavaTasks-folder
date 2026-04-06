import java.util.Scanner;

public class ReadsTwoIntegers{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the first integer:");
    int num1 = sc.nextInt();

    System.out.print("Enter the Second Integer:");
    int num2 = sc.nextInt();

 if ( num2== 0){


System.out.print("Error");


} else {
int formular = num1/num2;

    System.out.printf("The answer is %d", formular);
}
   







    


 }


}





