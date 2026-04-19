import java.util.Scanner;

public class CollectInput{

    public static void main(String []  args){
    
    Scanner sc= new Scanner(System.in);
   
    System.out.print("enter the integers:");
     int userDigit = sc.nextInt();
int sum=0;

while (userDigit > 0){

sum+=userDigit%10;

userDigit/=10;


   }

  System.out.printf("the sum is %d",sum);



}











}
