


public class Pizza{




public static int pizza(int number, int people){

int price=0;
double boxes;
int calculatedBoxes=0;


int sliceLeft = 0;

switch(number){
        case 1 : 
             boxes= (double) people/ 4;
            
            calculatedBoxes= (int) Math.ceil(boxes);
            sliceLeft= (4*calculatedBoxes)-people;
            price= 2500 * calculatedBoxes;
            System.out.printf("Number of boxes are %d%n",calculatedBoxes);
            System.out.printf("Number of leftover slice are %d%n",sliceLeft);
            
            

            break;

       case  2: 
            boxes= (double)  people/ 6;
            calculatedBoxes= (int)  Math.ceil(boxes);
            sliceLeft= (6*calculatedBoxes)-people;
            price= 2900* calculatedBoxes;

            System.out.printf("Number of boxes are %d%n",calculatedBoxes);
            System.out.printf("Number of leftover slice are %d%n",sliceLeft);
            

            break;


        case  3: 
            boxes=   (double) people/ 8;
            calculatedBoxes=  (int) Math.ceil(boxes);
            sliceLeft= (8*calculatedBoxes)-people;
            price= 4000 * calculatedBoxes;

            System.out.printf("Number of boxes are %d%n",calculatedBoxes);
            System.out.printf("Number of leftover slice are %d%n",sliceLeft);
          

            break;


        case 4: 
            boxes=  (double)  people/ 12;
            calculatedBoxes=  (int) Math.ceil(boxes);
            sliceLeft= (12*calculatedBoxes)-people;
            price= 5200 * calculatedBoxes;

            System.out.printf("Number of boxes are %d%n",calculatedBoxes);
            System.out.printf("Number of leftover slice are %d%n",sliceLeft);
            

            break;
            
        default:
            System.out.print("invalid");

                               

}




 return price;









}






}



