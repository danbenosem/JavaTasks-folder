import java.util.Scanner;
import java.util.Arrays;


public class TaskSix{


        public static void main (String [] args){
  int [] array= {2,4,5,7,9};

    System.out.print(array1(array));

        }

    public  static int array1(int array[]){
    int sum=0;
  
    for(int index =0; index<array.length; index ++){
           if (index%2==0){
            sum+=array[index];
                 
              ;
        }

  }

              
return sum;

        }             









}


