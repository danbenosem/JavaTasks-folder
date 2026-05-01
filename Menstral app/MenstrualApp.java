import java.util.Scanner;

public class MenstrualApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Press 1 if you had your period today: ");
        int userInput = scanner.nextInt();
        
        if (userInput == 1) {
            int cycle = 28;
            int flow = 5;
            
            int ovDay = getOvulation(cycle);
            int fStart = getFertileStart(ovDay);
            int fEnd = getFertileEnd(ovDay);
            
            System.out.printf("Your cycle length is in the next %d days.%n", cycle);

            System.out.printf("Flow Date: Day 1 to %d%n", flow);

            System.out.printf("Ovulation Date: Day %d%n", ovDay);

            System.out.printf("Fertile Window: Day %d to %d%n", fStart, fEnd);
            
            printSafePeriods(flow, fStart, fEnd, cycle);
        }
        
        scanner.close();
    }

    public static int getOvulation(int cycle) { 


             return cycle - 14; 


}



    public static int getFertileStart(int ovDay) {

     return ovDay - 5; 

}
    public static int getFertileEnd(int ovDay) { 



      return ovDay + 2; 



}
    
    public static void printSafePeriods(int flow, int fStart, int fEnd, int cycle) {
   int flow1= flow+1;
int fstart1= fStart - 1;
int fEnd1= fEnd + 1;

        System.out.printf("Safe Period 1: Day %d to %d%n", flow1, fstart1);
      

           System.out.printf("Safe Period 2: Day %d to %d%n", fEnd1, cycle);
    }
}
