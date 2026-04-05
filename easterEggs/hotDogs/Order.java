import java.util.Scanner;

public class Order{

        public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First intger:");
    int num1= sc.nextInt();
    
System.out.println("Enter the Second intger:");
    int num2= sc.nextInt();
 System.out.println("Enter the Third intger:");
    int num3= sc.nextInt();



    if(num1>=num3 && num2>=num3){

              if (num1>=num2){

             System.out.printf("The order is %d %d % d",num3,num2,num1);
        } else {
                System.out.printf("The order is %d %d % d",num3,num1,num2);
      }


    }else if (num1>=num2 && num3>=num2){

             if (num1>= num3){

            System.out.printf("The order is %d %d % d",num2,num3,num1);
        } else {

                      System.out.printf("The order is %d %d % d",num2,num1,num3);
        }



    }else if (num2>=num3 && num1>=num3){

            if (num2>= num1){

            System.out.printf("The order is %d %d % d",num3,num1,num2);
        } else {

            System.out.printf("The order is %d %d % d",num3,num2,num1);

}



    }else if (num2>=num1 && num3>=num1){

            if (num2>= num3){

            System.out.printf("The order is %d %d % d",num1,num3,num2);
        } else {

            System.out.printf("The order is %d %d % d",num1,num2,num3);
    }



    }  else if (num3>=num1 && num2>=num1){

            if (num3> num2){

            System.out.printf("The order is %d %d % d",num1,num2,num3);
        }else {

        System.out.printf("The order is %d %d % d",num1,num3,num2);
    }



    } else if (num3>num2 && num1>num2){

            if (num3>= num1){

            System.out.printf("The order is %d %d % d",num2,num1,num3);
        } else {

     System.out.printf("The order is %d %d % d",num2,num2,num1);
}



    }else{

System.out.print("that is strange");}
        











      
    






    }






}

