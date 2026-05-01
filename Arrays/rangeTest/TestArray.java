import org.junit.Test;

import static org.junit.Assert.assertEquals;







public class TestArray{

    @Test
  public void arrayTest(){

    int expectedAnswer = 18;

 int array1 []= {2,5,7,9,20}; 
  int actualAnswer = RangeArray.array(array1);


assertEquals(expectedAnswer,actualAnswer);


}



}

