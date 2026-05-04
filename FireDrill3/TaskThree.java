import java.util.Scanner;
import java.util.Arrays;


public class TaskThree{


        public static void main (String [] args){
    Scanner sc= new Scanner(System.in);
int scores;

        int array []= new int [10];

    for(int index =0; index<array.length; index ++){
            System.out.print("enter scores:");
            scores= sc.nextInt();
        array[index]= scores;

  }

 for (int number: array){

    System.out.print(number);
}



}

}


