import java.util.Scanner;

public class cattern{

    public static void main(String []  args){
    
    Scanner sc= new Scanner(System.in);
   
    System.out.print("Enter the number of rows");
     int row= sc.nextInt();

    System.out.print("Enter the number of column");
     int column= sc.nextInt();


    for (int number=1; number<=5; number++){


        for(int numberTwo= number; numberTwo<=5; numberTwo++){
            System.out.print("*");


     }
            System.out.println("");
    }









}
}
