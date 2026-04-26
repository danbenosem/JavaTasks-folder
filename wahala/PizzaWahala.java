import java.util.Scanner;


public class PizzaWahala{




public static void main(String [] args){

Scanner sc= new Scanner(System.in);
double boxes;
int calculatedBoxes=0;


int sliceLeft = 0;



System.out.println("enter the pizza Type");

System.out.println("1. sapa size");
System.out.println("2. small money");
System.out.println("3. big boys");
System.out.println("4. odogwu");

int number=sc.nextInt();


 int price= 0;

System.out.println("enter the number of people");
 int people= sc.nextInt();




switch(number){
        case 1 : 
             boxes= (double) people/ 4;
            
            calculatedBoxes= (int) Math.ceil(boxes);
            sliceLeft= (4*calculatedBoxes)-people;
            price= 2500 * calculatedBoxes;
            

            break;

       case  2: 
            boxes= (double)  people/ 6;
            calculatedBoxes= (int)  Math.ceil(boxes);
            sliceLeft= (6*calculatedBoxes)-people;
            price= 2900* calculatedBoxes;

            break;


        case  3: 
            boxes=   (double) people/ 8;
            calculatedBoxes=  (int) Math.ceil(boxes);
            sliceLeft= (8*calculatedBoxes)-people;
            price= 4000 * calculatedBoxes;

            break;


        case 4: 
            boxes=  (double)  people/ 12;
            calculatedBoxes=  (int) Math.ceil(boxes);
            sliceLeft= (12*calculatedBoxes)-people;
            price= 5200 * calculatedBoxes;

            break;
            
        default:
            System.out.print("invalid");


                               

}


System.out.printf("Number of boxes are %d%n",calculatedBoxes);
System.out.printf("Number of leftover slice are %d%n",sliceLeft);
System.out.printf("price is %d%n",price);









}






}



