public class PentagonalNumber{



    public static void main(String [] args){

for (int number=1; number<=100; number++){

System.out.printf("%7d",getPentagonalNumber(number));

if (number%10==0){

System.out.println();
}

}





    }


public static int getPentagonalNumber(int n){

int pent= (n*(3*n -1))/2;

return pent;


}


















}
