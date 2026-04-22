import java.util.Scanner;

public class GasMillage{


    public static void main(String [] args){

    Scanner inputCollector= new Scanner(System.in);

    
    int miles=0;
    int gallon=0;
    int totalMiles=0;

float averageTotal=0;
    int count= 0;

        float milesGallon;
    

    int average;
    int number=1;

    while (number!=0){
        System.out.print("press 0 to end this program , to continue press any other number:");
         number= inputCollector.nextInt();
        if(number==0){
            break;
        }
        
     System.out.print("Enter the miles:");
       miles= inputCollector.nextInt();

      System.out.print("Enter the gallon:");
       gallon= inputCollector.nextInt();

       milesGallon= (float) miles/gallon;
      
       averageTotal+=milesGallon;
       
        System.out.printf("the miles per gallon is %f%n:",milesGallon);
    


    }

 System.out.printf("the Combined miles per gallon is %f",averageTotal);








        }





}
