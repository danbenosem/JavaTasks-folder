
 // BASED ON CHAPTER 6 DIETEL BOOK PAGE 280
 // AN EXMAPLE WAS USED TO GENERATE RANDOM NUMBERS WHICH I FOLLOWED

import java.security.SecureRandom;

public class RandomnNumber{

    public static void main (String [] args){
    
   

    
    SecureRandom random = new SecureRandom();
    int random1 =  random.nextInt(7) ;

if(random1==0){

    System.out.print("violet");

}else if(random1==1){

    System.out.print("indigo");

} else if(random1==2){

    System.out.print("blue");

}  else if(random1==3){

    System.out.print("green");

}   else if(random1==4){

    System.out.print("yellow");

}  else if(random1==5){

    System.out.print("orange");

}  else if(random1==6){

    System.out.print("red");

}
  
  
  
  
    

 

    
    }




}
