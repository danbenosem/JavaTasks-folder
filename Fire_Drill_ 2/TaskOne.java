import java.util.Scanner;

public class TaskOne{

    public static void main(String []  args){
    
    Scanner inputCollector = new Scanner(System.in);
    int scores;
    int number= 1;
    int total=0;

    while(number<=10){
    System.out.print("Enter the scores:");
    scores= inputCollector.nextInt();
    total+=scores;
    number++;


}

System.out.printf("The sum is %d",total);


}












}
