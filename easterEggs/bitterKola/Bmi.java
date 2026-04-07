import java.util.Scanner;

public class Bmi{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weight :");
    double num1= sc.nextDouble();
    
   System.out.println("Enter the height :");
    double num2 = sc.nextDouble();

  

 double bmi = (num1)/(num2*num2) ;

if (bm1<18.5){

    System.out.println("Underweight");
}else  (bm1>=18.5 && bmi<= 24.9 ){

    System.out.println("NormalN");
} else  (bm1>=25 && bmi<= 29.9 ){

    System.out.println("overweight");
} else  (bm1>+30){

    System.out.println("obese");
}


      
    

System.out.printf(" The Bmi  is %f %n",bmi);

    





    }






}
