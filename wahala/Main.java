public class Main{



    public static void main(String [] args){

java.util.Scanner input= new java.util.Scanner(System.in);
System.out.print("Enter the amount:");

int num= input.nextInt();

            Backtosender myback= new Backtosender();

int finalPayment= myback.payment(num);



System.out.print(finalPayment);






















}












}
