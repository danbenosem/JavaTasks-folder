import java.util.Scanner;

public class SpeedK{


public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the speed in km/hr:");

int speed= sc.nextInt();



if(speed==0){

 System.out.print("Stationary");

} else if (speed >0 && speed <= 40){

System.out.print("slow");

} else if (speed >40 && speed <= 80){

System.out.print("moderate");

} else if (speed >80 && speed <= 120){

System.out.print("fast");

} else if (speed >120){

System.out.print("Dangerously fast");

}
























}













}
