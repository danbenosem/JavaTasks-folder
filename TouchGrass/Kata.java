import java.util.Scanner;



public class Kata{
  public static void main(String [] args){

Scanner inputCollector= new Scanner(System.in);

System.out.print("Enter a number:");

int even = inputCollector.nextInt();

boolean evenResult= isEven(even);
System.out.println(evenResult);

int firstNumber=9;
int secondNumber=10;

int result= max(firstNumber, secondNumber);

System.out.println(result);




}



public static int max(int a, int b){

  int maximumValue = a;

  if (b>a){

   maximumValue = b;
}
        return maximumValue;
}



public static boolean isEven(int a){
    
    if(a%2==0){
        return true;
    }
  else {
            return false;
        }


       
}

 







}
