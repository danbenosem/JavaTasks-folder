import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
      Scanner inputCollector= new Scanner(System.in);
       System.out.print("Enter the string:");
String string = inputCollector.next();

System.out.println("the number of count is s" + countLetters(string ));
       
    }

    public static int countLetters(String s) {
int count=0;
 for (int character=0; character<s.length(); character++){
         char string= s.charAt(character);
          count ++;
    }

  return count;
}

}

