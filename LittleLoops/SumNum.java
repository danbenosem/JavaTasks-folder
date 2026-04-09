import java.util.Scanner;


public class SumNum{



public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");

int user = sc.nextInt();
 int store=0;
int numbers=1;
while (numbers<=user){


System.out.println(numbers);

store+=numbers;

numbers++;


}
System.out.print(store);


}


}
