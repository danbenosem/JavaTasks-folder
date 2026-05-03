import java.util.Scanner;

public class FutureInvestment {

    
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter investment amount : ");

        double amount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");

        double annualRate = input.nextDouble();
        
        
        double monthlyRate = annualRate / 100 / 12;

        
        System.out.println("Years     Future Value");
        
       
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(amount, monthlyRate, year);
            
            System.out.printf("%d   %.2f\n", year, futureValue);
               }
        
        




    }



 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

}
