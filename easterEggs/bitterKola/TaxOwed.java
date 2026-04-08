import java.util.Scanner;

public class TaxOwed{


public static void main (String [] args){



Scanner sc = new Scanner(System.in);

double taxCounter = 0



System.out.print("Enter the annual tax");

double tax1 = sc.nextDouble();


if(tax1>300000 && tax1<=600000){

 double tax1= tax1*0.15;

} else if (tax1 > 600000){

double tax1= tax1*0.25;
}

System.out.print(tax1);























}













}
