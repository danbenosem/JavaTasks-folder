


public class RangeArray{



    public static void main(String [] args){

     
 int array1 []= {2,5,7,9,20}; 
  int array2 []= {2,9,1};   
  

System.out.print(array(array1));
System.out.println("");
System.out.print(array(array2));
}



 public static int array(int array []){
int largest=0;
int minimum=0;
int range=0;
int index;
largest = array[0];
  minimum= array[0];
      for( index=0; index<array.length; index++){

    
  
                if(array[index]>largest){
                largest = array[index];

                }
               
            

    


}

for(index=0; index<array.length; index++){



                if (array[index]<minimum){

                minimum= array[index];

            }
}
range = largest - minimum;

 return range;

}















}


















