import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




public class TemperatureConversionTest{

   




    public static double celsiusToFahrenheit(double celsius) {
        // Standard math formula: (9/5) * C + 32
        
        return (9.0 / 5) * celsius + 32;
    }

    @Test
   public void celsiusTofarhenheitTest (){

    double expected= 32;
   double actual=   celsiusToFahrenheit(0);
  assertEquals(expected, actual,0.001);

 expected = 212.0;
actual = celsiusToFahrenheit(100);
 assertEquals(expected, actual, 0.001);


        assertEquals(-40.0, celsiusToFahrenheit(-40), 0.001);
 


  }





}
