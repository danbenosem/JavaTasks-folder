import java.util.Scanner;

public class YearDays {
    public static void main (String [] args ){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the month in terms of integers:" );
int month= sc.nextInt();

System.out.print("Enter the year:");
int year = sc .nextInt();

// based on the last assignment doughnut i found out that a year is a leap year if it is divisible by 4 and not 100 or divisible by 400

if ( (year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
    
    if (month== 2){
    
        System.out.print("It has 29 days");

}




} else {
                     
                    if (month== 1){
                    
                        System.out.print("It has 31 days");

                } else  if (month== 2){
    
        System.out.print("It has 28 days");

   } else  if (month== 3){
    
        System.out.print("It has 31 days");

   }   else  if (month== 4){
    
        System.out.print("It has 30 days");

   }  else  if (month== 5){
    
        System.out.print("It has 31 days");

   }   else  if (month== 6){
    
        System.out.print("It has 30 days");

   }  else  if (month== 7){
    
        System.out.print("It has 31 days");

   }  else  if (month== 8){
    
        System.out.print("It has 31 days");

   }  else  if (month== 9){
    
        System.out.print("It has 30 days");

   }  else  if (month== 10){
    
        System.out.print("It has 31 days");

   }  else  if (month== 11){
    
        System.out.print("It has 30 days");

   }  else  if (month== 12){
    
        System.out.print("It has 31 days");

   }













    


}







}



}
