import java.util.Scanner;

public class ReadA{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first   integer :");
    int num1= sc.nextInt();
    
   System.out.println("Enter the second intger :");
    double num2 = sc.nextInt();

  int sum = num1 + num2;
int product = num1 * num2;
int diff = num1 - num2

 if (num1>= 0 && num2>=0){

System.out.printf(" The sum  is %d %n",sum);


} else if (num1< 0 && num2 < 0){

System.out.printf(" The sum  is %d %n",product);


} else if (num1< 0 && num2 >0  ||   num1> 0 && num2 <0){

System.out.printf(" The sum  is %d %n",diff);


}


      
    



    





    }






}
