import java.util.Scanner;

public class ReversePalindrome{



    public static void main(String [] args){

  
   Scanner inputCollector= new Scanner(System.in);


 System.out.print("Enter integer:");
   int number= inputCollector.nextInt();

System.out.println( reverse(number) );

System.out.println( isPalindrome(number) );


}





    


public static int reverse(int number){

int reverse=0;
while (number>0){
reverse= (reverse *10) + (number%10);
number/=10;

}

return reverse;


}



public static boolean isPalindrome(int number){

if (number == reverse(number)){

return true;
} else{

return false;
}


}


    















}
