import java.util.Scanner;
import java.util.Arrays;


public class TaskFour{


        public static void main (String [] args){
        int [] array= {2,4,5,7,9};
          array1(array);

    for (int number: array1(array));
            System.out.print(number);
        }


    public  static int [] array1(int array[]){

        int Narr[]= new int[array.length];
        int number=0;
    
  
       for(int index =0; index<array.length; index ++){
           if (index%2==0){
                 
              Narr[index]= array[index];
           }
            else{
        Narr[index]=0;
}

        }

 
              
        return Narr;


        }             








}


