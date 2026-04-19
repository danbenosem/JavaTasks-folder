import java.util.Scanner;

public class LargestInt{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter the integer:");

int value= inputCollector.nextInt();

int largest=0;
int largestCount=0;

while (value!=0){
            if (value>largest){

            largest= value;
            largestCount=1;
        
    }  else   if (value==largest){

            largest= value;
            largestCount++;
        
    }



        System.out.print("Enter the integer:");

          value= inputCollector.nextInt();





}    


    System.out.printf("The largest number is %d and the count %d",largest, largestCount );
















    }





}
