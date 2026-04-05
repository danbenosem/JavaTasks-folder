    import java.util.Scanner;

public class LeapYear {


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the year:");
double year= sc.nextDouble();

if (year % 4 == 0 && year % 100 != 0){

 System.out.print("it is a leap year");

    



} else if (year % 400 == 0){

 System.out.print("it is  a leap year");

    



} 

else {
  System.out.print("not a leap year");
}






}




}
