import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PizzaTest{

    @Test
  public void pizzaTest(){

    int expectedAnswer = 20800;
  

  Pizza myPiz= new Pizza();


  int actualAnswer = myPiz.pizza(4,45);
  


}
@Test
public void PizzaTest1(){

  int expectedAnswer= 7500;

 Pizza myPiz= new Pizza();
 

int actualAnswer=  myPiz.pizza(1,12);


assertEquals(expectedAnswer,actualAnswer);
}


 

}
