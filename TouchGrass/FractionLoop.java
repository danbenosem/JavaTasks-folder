import java.util.Scanner;

public class FractionLoop{


    public static void main(String [] args){
 //     A = a + (n-1)d
    

  double total=0;


for(int numerator= 1;numerator<=99; numerator+= 2){
            
        int denominator= numerator + 2;

        total+= (double) numerator/denominator;


         


}

System.out.printf("the total number is %f", total);

    


    
    }





}
