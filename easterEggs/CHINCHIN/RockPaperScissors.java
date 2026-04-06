import java.security.SecureRandom;

import java.util.Scanner;

public class RockPaperScissors{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);
SecureRandom random = new SecureRandom();

int random1 = random.nextInt(3);

String name="";

if (random1==0){
    name +="Rock";
  

} else if (random1==1){

    name += "paper"; 

} else if (random1==2){

    name += "Scissors"; 

} 



  System.out.print("Enter 0 for Rock ,1 for Paper, 2 for Scissors:");
    int number = sc.nextInt();

if(random1==number){
    System.out.printf(" it is %s ,it is a draw ",name);

} else if (number==1 && random1==0)  {

    System.out.printf("it is %s ,you win",name);


} else if (number==2 && random1==1)  {

    System.out.printf("it is %s ,you win",name);


} else if (number==0 && random1==2)  {

    System.out.printf("it is %s ,you win",name);


} else   {

    System.out.printf("it is %s ,you lose" ,name);


}
  
  
  
    








}
}
