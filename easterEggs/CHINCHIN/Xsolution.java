import java.util.Scanner;

public class Xsolution{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the coefficient a:");
    int num1 = sc.nextInt();

    System.out.print("Enter the coefficient b:");
    int num2 = sc.nextInt();

     System.out.print("Enter the coefficient c:");
    int num3 = sc.nextInt();

     System.out.print("Enter the coefficient d:");
    int num4 = sc.nextInt();

    if(num1==0){
        System.out.print("No unique solution");
} else {

      double solution= (num3-num2)/num1;
    System.out.print(solution)

}

  
   
    
   
   







    


 }


}





