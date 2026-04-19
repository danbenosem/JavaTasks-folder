

public class Prime{


    public static void main(String [] args){

           


for(int number=1;number<=100 ; number++){

      boolean isPrime = true;
    if (number>1){
        
        
    for (int numberTwo=2; numberTwo<number; numberTwo++){


        if (number %numberTwo==0){


            isPrime=false;
        }


}



} else {

isPrime = false;

}

if (isPrime){

        System.out.println(number);
}

}



    


    
    }





}
