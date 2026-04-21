import java.util.Scanner;



public class Kata{
  public static void main(String [] args){

Scanner inputCollector= new Scanner(System.in);

System.out.print("Enter a number:");

int even = inputCollector.nextInt();

boolean evenResult= isEven(even);
System.out.println(evenResult);

boolean Prime = isPrimeNumber(even);
System.out.printf("is it a prime number? %b%n",Prime);
int firstNumber=9;
int secondNumber=10;

int result= max(firstNumber, secondNumber);


System.out.println(result);



int subResult= subtract(firstNumber, secondNumber);
System.out.println(subResult);

int quoResult= quotient(firstNumber, secondNumber);
System.out.println(quoResult);

int factorResult= factorOf(even);
System.out.println(factorResult);


boolean perfectResult= isPerfectSquare(even);
System.out.println(perfectResult);


boolean palin= isPalindrome(even);
System.out.println(palin);

long facto= factorial(even);
System.out.println(facto);

long squarevalue= squareOf(even);
System.out.println(squarevalue);
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


public static boolean isPrimeNumber(int a){
    
    if(a<=1){
        return false;
    }
  else if (a==2){
        return true;
    }

  else if (a%2==0){
        return false;
    }


    int limit = (int) Math.sqrt(a);

    for (int number= 3; number<=limit;number+=2){

           
    if(a%number==0){
        return false;
    }
}
  return true;     
}
 


public static int subtract(int a, int b){
    int subtract= a-b;

    return subtract;

}



public static int quotient(int a, int b){
    return a/b;


}

public static int factorOf(int a){
int count=0;
    for (int num=1; num<= a; num++){
        if (a % num==0){
            count++;
            
            }
    
        }

        return count;
}

public static boolean isPerfectSquare(int a){
    int square= (int) Math.sqrt(a);
    if (square * square==a){

        return true;
    }
    else {
            return false;
        }
}


public static boolean isPalindrome (int a){

int digit1= a/10000;
int digit2= (a %10000)/1000;
int digit3= ((a%10000)%1000)/100;
int digit4= (((a%10000)%1000)%100)/10;
int digit5= (((a%10000)%1000)%100)%10;

if (digit1==digit5){
        return true;
  }
 else {
        return false;
    }   

}


public static long factorial (int a){
   int facto=1 ;
    for (int number=a; number>=1; number--){
       facto*=number;

    }

    return facto;

}

public static long squareOf(int a){

    int square = a * a;
    return square;


}

}
