import java.util.Scanner;


public class UserInputDown{



public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");

int user = sc.nextInt();
 

while (user>0){

System.out.println(user);



user--;


}



}


}
