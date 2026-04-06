import java.security.SecureRandom;



public class RandomCo{
public static void main (String [] args){

 
 SecureRandom random = new SecureRandom();

 int random1 = random.nextInt(50);
 int random2 = random.nextInt(150);

System.out.printf("% d,%d",random1,random2);


    








}
}
