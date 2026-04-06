import java.util.Scanner;

public class Perimeter{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the length of the first edge:");
    int num1 = sc.nextInt();

    System.out.print("Enter the length of the first edge:");
    int num2 = sc.nextInt();

 if ( num1 != num2){

int perimeter = 2 *(num1 + num2);
System.out.printf("The perimeter is %d",perimeter);


} else {
System.out.print("Invalid");

}
   







    


 }


}





