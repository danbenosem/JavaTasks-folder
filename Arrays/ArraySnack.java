public class ArraySnack{

      public static void main(String [] args){

int array []= {5,2,3,6,7,8,9};



 int maximum= largest(array);// 1

System.out.println(maximum);

 reverse(array); //2

boolean checker= checker(array,2);
System.out.println(checker); //3

odd(array);//3
System.out.println();

int even []= even(array);
for (int number:even){
 System.out.print(number);

}//5
System.out.println();
System.out.println(runningTotal(array));//6

sumDoWhileLoop(array);
System.out.print(sumDoWhileLoop(array));//7
}






public static int largest(int arrays[]){

 int maximum=0;
 for (int index=0; index<arrays.length; index++){

      if (arrays[index]> maximum){
    maximum= arrays[index];
  

                      } 
       }

 return maximum;



    }
     
  
public static void reverse(int arrays[]){

for(int index=arrays.length-1; index>=0; index--){

        System.out.print(arrays[index]);


}
 System.out.println();
  

}


public static boolean checker(int arrays[],int element){

 
 for (int index=0; index<arrays.length; index++){

      if (arrays[index]== element){
                System.out.println("Element exits");
                return true;
       } 


  

    
}
 return false;
}



public static void odd(int arrays[]){

 
 for (int index=0; index<arrays.length; index++){

      if (index%2== 1){
               System.out.print(arrays[index]);
       } 


   

     
}

}


public static int []even(int arrays[]){

 
int even[] = new int[(arrays.length+1)/2];

int counter=0;
 for (int index=0; index<arrays.length; index+=2){

 even[counter]= arrays[index];
counter++;

}


return even;

}


public static int runningTotal(int arrays[]){

int sum=0;

for(int index=0; index<arrays.length; index++){

  sum+=arrays[index];



}
return sum;

}



public static int sumDoWhileLoop(int[] arr) {
    if (arr.length == 0) return 0;
    
    int sum = 0;
    int i = 0;
    do {
        sum += arr[i];
        i++;
    } while (i < arr.length);
    
    return sum;
}






}
