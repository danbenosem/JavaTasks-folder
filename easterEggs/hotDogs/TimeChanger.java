import java.util.Scanner;

public class TimeChanger{


    public static void main(String [] args){
// 3600 sec makes 1 hour

Scanner sc = new Scanner(System.in);

System.out.print("Enter the time in seconds: ");
int Time = sc.nextInt();

int digit1 = Time/3600;
int digit2= (Time%3600)/60;
int digit3 = (Time%3600) % 60 ;


System.out.printf("%d seconds = %d hour, %d minutes, %d seconds ", Time, digit1, digit2, digit3);






}


}
