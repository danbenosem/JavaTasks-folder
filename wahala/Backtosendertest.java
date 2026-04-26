import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Backtosendertest{

    @Test
  public void paymenttest(){

    int expectedAnswer = 45000;

Backtosender myback= new Backtosender();
  int actualAnswer = myback.payment(80);


assertEquals(expectedAnswer,actualAnswer);


}



}
