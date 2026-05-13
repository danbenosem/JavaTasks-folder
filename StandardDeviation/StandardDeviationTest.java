import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StandardDeviationTest{


    @Test
    public void testThatItReturnsValidOutPut(){

    int expected= 0;

    int actual= StandardDeviation.deviate();

  assertEquals(expected, actual);


  }


   @Test
    public void testWithThreeConsecutiveNumbers() {
        
        double expected = 0.816; 
        double actual = StandardDeviation.standard(1, 2, 3);
        
        assertEquals(expected, actual, 0.001);
    }


  @Test
    public void testSingleNumber() {
        
        double expected = 0.0;
        double actual = StandardDeviation.standard(7);
        
        assertEquals(expected, actual, 0.001);
    }

@Test
    public void testIdenticalNumbers() {
        
        double expected = 0.0;
        double actual = StandardDeviation.standard(5, 5, 5);
        
        assertEquals(expected, actual, 0.001);
    }


 @Test
    public void testNegativeNumbers() {
        
        double expected = 4.082; 
        double actual = StandardDeviation.standard(-5, 0, 5);
        
        assertEquals(expected, actual, 0.001);
    }








}
