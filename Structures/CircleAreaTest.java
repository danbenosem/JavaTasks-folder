 import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




public class CircleAreaTest {
    


    public static double circleArea(double radius) {
        
        return Math.PI * radius * radius;
 


   }




   @Test

public void circletestMethod(){
     
  double expected= 3.14159; 
   double actual=   circleArea(1.0);
  assertEquals(expected, actual);

expected= 78.5398; 
    actual=   circleArea(5.0);
  assertEquals(expected, actual);

expected= 0.0; 
    actual=   circleArea(0.0);
  assertEquals(expected, actual);

     }
}

