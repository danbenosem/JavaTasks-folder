import java.util.Scanner;

public class IncomeTax{


    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter your filing status,0 for single, 1 for married filing jointly,2 for married filing separately, 3 for head of household :");
    int filing = sc.nextInt();

     System.out.print("Enter your taxable income:");
    int tax = sc.nextInt();

    
    if (filing == 0){

                  if (tax >0 && tax <=8350){

                double taxrate= tax *0.1;
             System.out.printf("new income is %f",taxrate);



            } else  if (tax >8350 && tax <=33950){

                double taxrate= tax *0.15;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >33950 && tax <=82250){

                double taxrate= tax *0.25;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >82250 && tax <=171550){

                double taxrate= tax *0.28;
             System.out.printf("new income is %f",taxrate);



            }   else  if (tax >171550 && tax <=372950){

                double taxrate= tax *0.33;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >372950){

                double taxrate= tax *0.35;
             System.out.printf("new income is %f",taxrate);



            }




} else   if (filing == 1){
        
            if (tax >0 && tax <=16700){

                double taxrate= tax *0.1;
             System.out.printf("new income is %f",taxrate);



            } else  if (tax >16700 && tax <=67900){

                double taxrate= tax *0.15;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >67900 && tax <=137050){

                double taxrate= tax *0.25;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >137050 && tax <=208850){

                double taxrate= tax *0.28;
             System.out.printf("new income is %f",taxrate);



            }   else  if (tax >208850 && tax <=372950){

                double taxrate= tax *0.33;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >372950){

                double taxrate= tax *0.35;
             System.out.printf("new income is %f",taxrate);



            }


    


}  else if (filing == 2){

                  if (tax >0 && tax <=8350){

                double taxrate= tax *0.1;
             System.out.printf("new income is %f",taxrate);



            } else  if (tax >8350 && tax <=33950){

                double taxrate= tax *0.15;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >33950 && tax <=68525){

                double taxrate= tax *0.25;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >68525 && tax <=104525){

                double taxrate= tax *0.28;
             System.out.printf("new income is %f",taxrate);



            }   else  if (tax >104525 && tax <=186475){

                double taxrate= tax *0.33;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >186475){

                double taxrate= tax *0.35;
             System.out.printf("new income is %f",taxrate);



            }




}  else if (filing == 3){

                  if (tax >0 && tax <=11950){

                double taxrate= tax *0.1;
             System.out.printf("new income is %f",taxrate);



            } else  if (tax >11950 && tax <=45500){

                double taxrate= tax *0.15;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >45500 && tax <=117450){

                double taxrate= tax *0.25;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >117450 && tax <=190200){

                double taxrate= tax *0.28;
             System.out.printf("new income is %f",taxrate);



            }   else  if (tax >190200 && tax <=372950){

                double taxrate= tax *0.33;
             System.out.printf("new income is %f",taxrate);



            }  else  if (tax >372950){

                double taxrate= tax *0.35;
             System.out.printf("new income is %f",taxrate);



            }




} 









    


 


}




}
