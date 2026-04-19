import java.util.Scanner;

public class Sophomore{


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);


   System.out.print("Enter the character:");
    char major= inputCollector.nextLine().charAt(0);
    char major_upper= Character.toUpperCase(major);
    System.out.print("Enter the year:");
    int year= inputCollector.nextInt();


    switch (major_upper){



    case 'I':
            if (year==1){

                     System.out.print("Information management and Freshman");

            } else if (year==2){

                     System.out.print("Information management and Sophomore");

            }  else if (year==3){

                     System.out.print("Information management and junior");

            } else if (year==4){

                     System.out.print("Information management and senior");

            }
     break;

case 'C':
            if (year==1){

                     System.out.print("Computer Science and Freshman");

            } else if (year==2){

                     System.out.print("Computer Science and Sophomore");

            }  else if (year==3){

                     System.out.print("Computer Science and junior");

            } else if (year==4){

                     System.out.print("Computer Science and senior");

           }

break;

case 'A':
            if (year==1){

                     System.out.print("Accounting and Freshman");

            } else if (year==2){

                     System.out.print("Accounting and Sophomore");

            }  else if (year==3){

                     System.out.print("Accounting and junior");

            } else if (year==4){

                     System.out.print("Accounting and senior");

            }



      


    




    


    


    }


    }





}
