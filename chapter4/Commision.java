import java.util.Scanner;

public class Commision{


    public static void main(String [] args){

    Scanner inputCollector= new Scanner(System.in);
//     number= inputCollector.nextInt(
//

  int number=1;
double value=0;
double total=0;

double pay=0;
        
    while (number!=0){
                    
                            System.out.println("Enter the item betwween item 1-4");
                            System.out.println("1)  239.99");
                            System.out.println("2)  129.75");
                            System.out.println("3)  99.95");
                            System.out.println("4)  350.89");
                        int item = inputCollector.nextInt();
                        if (item==0){
                              break;
                      }       


                        if(item>0 && item<5){
                            int inner=0;
                            while (inner!=-1){
                                    
                            System.out.println("enter the another item || to end press ");
                            
                            inner= inputCollector.nextInt();

                                        if (inner==0){
                                            
                                            break;
                                        }
                                         
                                        if (inner==1){

                                            value=239.99;
                                            total+=value;
                                        } else if (inner==2){

                                            value=129.75;
                                            total+=value;
                                        }
                                            else if (inner==3){

                                            value=99.75;
                                            total+=value;
                                        }
                                        else if (inner==4){

                                            value=350.89;
                                             total+=value;
                                        }


                                   }


                       }


        
        
            
    }



 pay = 200 + (0.09*total);

System.out.printf("pay is %f",pay);


        
















}
}
