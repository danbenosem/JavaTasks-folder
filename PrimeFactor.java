import java.util.Scanner;

public class PrimeFactor{


    public static void main(String []args){


       Scanner inputCollector= new Scanner(System.in);

       System.out.print("Enter the number:");
        int number= inputCollector.nextInt();
       int num;
int total=0;
 
int counter=2;       
       

while ( number!=1){
    
        if ( number % counter==0){
              number= number/counter;
               total+= counter;
                
            

                

        }else{  
                counter++;
                

            
}

 }
            
        
System.out.print(total);



















}

}
