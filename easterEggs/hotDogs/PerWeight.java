import java.util.Scanner;

public class PerWeight {


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the weight of the first packaged rice: ");
double weight1 = sc.nextDouble();

System.out.println("Enter the price of the  first packaged rice: ");
double price1 = sc.nextDouble();

System.out.println("Enter the weight of the second packaged rice: ");
double weight2 = sc.nextDouble();

System.out.println("Enter the price of the  second packaged rice: ");
double price2 = sc.nextDouble();

double formular1 = price1 / weight1;
double formular2 = price2 / weight2;





if (formular1 > formular2){
 
    System.out.println("The first Packaged rice is better\n");


} else if ( formular2 > formular1){

     System.out.print("The Second Packaged rice is better\n");
} else{
    
    System.out.print("They are the same");

}





}




}
