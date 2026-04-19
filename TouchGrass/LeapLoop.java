import java.util.Random;

public class LeapLoop{


    public static void main(String [] args){

           
Random random = new Random();

int headCount=0;
int tailCount=0;

for(int number=1;number<=1000000; number++){
       int randomint= random.nextInt(2);
        if(randomint==0){

        
        headCount++;

        } else if(randomint==1){


             
                tailCount++;
        }

   



}


System.out.printf("Number of head count is %d%n number of tail count is %d",headCount,tailCount);
    


    
    }





}
