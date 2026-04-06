import java.security.SecureRandom;

import java.util.Scanner;

public class Coin1{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);
SecureRandom random = new SecureRandom();

int random1 = random.nextInt(2);

String name="";

if (random1==0){
    name +="head";
  

} else if (random1==1){

    name += "tail"; 

}

  System.out.print("Enter 0 for head and 1 for tail:");
    int number = sc.nextInt();

if(random1==number){
    System.out.printf(" it is %s ,The guess is correct",name);

} else  {

    System.out.printf("it is %s ,The guess is not correct",name);


}
    








}
}
