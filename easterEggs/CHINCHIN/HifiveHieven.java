import java.util.Scanner;

public class HifiveHieven {


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the integer:");
int number = sc.nextInt();


    


 if (number % 5 == 0 ){
    System.out.print("HIFive");

} else if (number % 2 == 0 ){
    System.out.print("HIEven");

}  else {

    System.out.print("okay");
}



}




}
