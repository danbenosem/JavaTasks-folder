import java.util.Scanner;

public class LoopN{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


   System.out.print("Enter the power of 2 you want:");
    int power= inputCollector.nextInt();


for(int number=1;number<=power; number++){

    int decimalNum= (int) Math.pow(2, number);
    System.out.println(decimalNum);



}



    


    
    }





}
