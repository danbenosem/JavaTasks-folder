import java.util.Scanner;

public class WeightPackage{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the Weight of the package:");
    double weight = sc.nextDouble();

 if ( weight > 0 && weight <=2){

        System.out.print("The cost is $2.5");

}else if( weight > 2 && weight <=4){

        System.out.print("The cost is $4.5");

} else if( weight > 4 && weight <=10){

        System.out.print("The cost is $7.5");

} else if( weight > 10 && weight <=20){

        System.out.print("The cost is $10.5");

} else if (weight >20){
        System.out.print("The Package cannot be shipped");


}

   







    


 }


}





