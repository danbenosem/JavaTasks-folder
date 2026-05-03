import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;





public class IsEvenTest {


    public static boolean isEven(int n) {
       
        return n % 2 == 0;
    }


   @Test

public void isEvenTestMethod(){
     
    assertTrue(isEven(4));
     assertFalse(isEven(7));
  assertTrue(isEven(0));
  assertTrue(isEven(-2));

     }
}


