import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





public class FactorialTest {
    


    public static int factorial(int n) {
        int total = 1;
        
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

 @Test

public void FactorialtestMethod(){
     
  int expected= 1; 
   double actual=   factorial(0);
  assertEquals(expected, actual);

 expected = 1;
actual = factorial(1);
 assertEquals(expected, actual);

expected = 120;
actual = factorial(5);
 assertEquals(expected, actual);

expected = 720;
actual = factorial(6);
 assertEquals(expected, actual);

     }


}
 
