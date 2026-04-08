import java.util.Scanner;

public class YearDays {
    public static void main (String [] args ){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the time in mins:" );
int time= sc.nextInt();



int days= time / 1440;
int hours = (time % 1440)/60; 
int remain_mins= (time % 1440)%60;

System.out.printf("%d days, %d hours, %d",days,hours,remain_mins);








}



}
