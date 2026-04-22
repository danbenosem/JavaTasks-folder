import java.util.Scanner;

public class CreditLimit{


    public static void main(String [] args){

    Scanner inputCollector= new Scanner(System.in);


int accountNum=0;
int balance=0;
int items=0;
int credit=0;
int creditlimit=800;
int charges= 0;

int newBalance=0;


int number=1;
        
    while (number!=0){
        
                System.out.print("press 0 to end this program , to continue press any other number:");
                     number= inputCollector.nextInt();
                    if(number==0){
                        break;
                    }

                     System.out.print("Enter the balance, balance must be greater then 500:");
                        
                     balance= inputCollector.nextInt();

                    if (balance>500){

                        System.out.print("Enter the number items:");
                         items= inputCollector.nextInt();

                          if (items>3){
                             charges= 100;
                              credit+=50;
                         }
                        
                         newBalance= balance +charges- credit;
                        
                    }

                else {
                        System.out.print("Enter the balance, balance must be greater then 500:");
                        
                  
               balance= inputCollector.nextInt();

            }



    }

    System.out.printf("new balance is %d",newBalance);






        
















}
}
