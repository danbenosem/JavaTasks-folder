import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OshoFreePromoEngineTest{

@Test

public void testThatCartTotalLessThanFiveK_Works(){


    int expected= 4000;
    int actual=OshoFreePromoEngine.cartPromo(4000);

    assertEquals(actual, expected);


}
 @Test
public void testThatItReturnsValidOutPut(){

 double expected= 14_400;
 double actual=OshoFreePromoEngine.cartPriceDiscount(18000,"BIGBOY20");

 assertEquals(actual, expected);



}

@Test
    public void testforanotheroutput() {
        
        double expected= 4500;
        double actual = OshoFreePromoEngine.cartPriceDiscount(5000, "STARTER10");
        assertEquals(expected, actual);
    }


    @Test
        public void test1foranotheroutput() {
            
            double expected= 20150;
            double actual = OshoFreePromoEngine.cartPriceDiscount(31000, "OSHOFREE35");
            assertEquals(expected, actual,0.001);
        }


  @Test
    public void testforINVALIDPROMOCODE() {
        
        double expected=5000 ;
        double actual = OshoFreePromoEngine.cartPriceDiscount(5000, "OSHOFREE35");
        assertEquals(expected, actual,0.001);
    }

 @Test
    public void testforINVALIDAMOUNT() {
        
        double expected=6000 ;
        double actual = OshoFreePromoEngine.cartPriceDiscount(6000, "OSHOFREE35");
        assertEquals(expected, actual,0.001);
    }

















}
