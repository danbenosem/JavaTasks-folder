import java.util.Scanner;

public class TaskFour{

    public static void main(String []  args){
    
    Scanner inputCollector = new Scanner(System.in);
    int scores;
    int number= 1;
    int total=0;
    int count=0;
    int evenTotal=0;

    while(number<=10){
    System.out.print("Enter the scores:");
    scores= inputCollector.nextInt();
    
    total+=scores;
    count++;
    
    if (number % 2 ==0){
    evenTotal+=scores;

    }
    number++;


}
int average = total / count;

System.out.printf("The Sum is %d%n",total);
System.out.printf("The average is %d%n",average);
System.out.printf("The Sum of even indexes %d%n",evenTotal);





}












}
