import java.util.Scanner;

public class CountDown{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


   System.out.print("Enter the count down:");
    int count= inputCollector.nextInt();


for(int number=count;number>=1; number--){

    System.out.println(number);
    if (number==1){
             System.out.println("Blast off!!!");
        }



}



    


    
    }





}
