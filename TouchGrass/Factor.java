import java.util.Scanner;

public class Factor{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


   System.out.print("Enter the number:");
    int count= inputCollector.nextInt();


for(int number=1;number<=count; number++){

    if(count % number ==0){

    System.out.printf("%d is a factor of %d%n",number,count);


    }


}



    


    
    }





}
