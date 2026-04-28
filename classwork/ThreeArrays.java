import java.util.Arrays;


public class ThreeArrays{


  public static void main(String[]args){





         char array [][]= new char[3][3];



array[0] [0]= 'x';
array[0][1]= 'o';


array[0][2]= 'x';


array[1][0]= 'o';
array[1][1]= 'o';
array[1][2]= 'o';



array[2][0]= 'x';
array[2][1]= 'x';
array[2][2]= 'o';



for(int row= 0; row<array.length; row++){


    for (int column=0; column<array[row].length; column++){
                

                System.out.printf("%c", array[row][column]); 


}
  System.out.println();


}


System.out.println();


System.out.print(Arrays.deepToString(array));
System.out.println();


for(int row= 0; row<array.length; row++){


    for (int column=0; column<array[row].length; column++){
                
                if (array[row][column]== 'x'){
                        
               System.out.print(1);
}

       if (array[row][column]== 'o'){
                        
                 System.out.print(0);
           }

                


}
  System.out.println();


}














}

}
