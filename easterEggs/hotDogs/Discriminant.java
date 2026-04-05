import java.util.Scanner;

public class Discriminant{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int num1= sc.nextInt();
    
   System.out.println("Entee the value of b");
    int num2 = sc.nextInt();

    System.out.println("Enter the value od c:");
    int num3= sc.nextInt();

 int discriminant = (num2*num2)-(4*num1*num3);

if (discriminant>=1){

    System.out.print("Two roots");

}else if(discriminant==0){
   System.out.print("one root");

} else{
System.out.print("Equation has no real root");

}


      
    



    





    }






}
