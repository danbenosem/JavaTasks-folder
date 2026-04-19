import java.util.Scanner;

public class ReverseWhile{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


   System.out.print("Enter the number:");
    int number= inputCollector.nextInt();


while(number>0){


          int remainder= number%10;
         
          System.out.print(remainder);
            
             number/=10;
        }

     
    


    
    }





}
