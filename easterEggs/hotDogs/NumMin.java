import java.util.Scanner;

public class NumMin{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Time in minutes:");
    int number = sc.nextInt();
    // 525,600 minutes makes a year , a year is 365 days ,a day is 1440minutes

int year = number/525600;


int leftover_minutes;

if (year>1){
  leftover_minutes= number-(year*525600);


}else {
 leftover_minutes= number - (year*525600);
}

int days= leftover_minutes/1440;

      
    

System.out.printf(" The remaining time is %d years and %d days %n",year,days);

    





    }






}
