import java.util.Scanner;

public class PositiveAverage {


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


System.out.print("Enter the number:");
int number= inputCollector.nextInt();
int total=0;

int count=0;
int average;
while (number>0){
    total+=number;
    count++;
    System.out.print("Enter the number:");
     number= inputCollector.nextInt();




    }
System.out.print(count);

 average= total/count;

System.out.printf("The Average of positive numbers is %d",average);




    


    
    }





}
