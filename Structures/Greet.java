 import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class Greet {


   
    public static String greet(String name) {
        
        return "Hello, " + name + "!";
    }

 @Test

public void stringGreetMethod(){
     
  String expected= "Hello, Alice!";
   String  actual=   greet("Alice");
  assertEquals(expected, actual);

expected= "Hello, World!";
    actual=   greet("World");
  assertEquals(expected, actual);


     }



}
