public class ArraySnack{




    public static void main(String [] args){

int array []= {5,2,3};



 int maximum= largest(array);

System.out.print(maximum);

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
     
  



















}
