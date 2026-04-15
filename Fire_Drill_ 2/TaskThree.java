import java.util.Scanner;

public class TaskThree{

    public static void main(String []  args){
    
    Scanner inputCollector = new Scanner(System.in);
    int scores;
    int number= 1;
    int total=0;
    int count=0;

    while(number<=10){
    System.out.print("Enter the scores:");
    scores= inputCollector.nextInt();
    total+=scores;
    count++;
    number++;


}
int average = total / count;
System.out.printf("The Sum is %d%n",total);
System.out.printf("The average is %d",average);


}












}
