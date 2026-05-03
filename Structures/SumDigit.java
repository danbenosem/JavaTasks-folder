import java.util.Scanner;

public class SumDigit{



    public static void main(String [] args){

  
   Scanner inputCollector= new Scanner(System.in);


 System.out.print("Enter integer:");
   int number= inputCollector.nextInt();

System.out.println( sumDigit(number) );


}





    


public static int sumDigit(int number){

int sum=0;
while (number>0){
sum+=number%10;
number/=10;

}

return sum;


}


















}
