public class ComputeTaxTable {
    
    public static void main(String[] args) {
        
        
        System.out.println("Taxable\t\tSingle\t\tMarried Joint\tMarried Sep\tHead of House");
        System.out.println("-----------------------------------------------------------------------------");

        
        for (double income = 50000; income <= 70000; income += 100) {
            
            System.out.printf("%-15.0f", income);
            
            System.out.printf("%-16.2f", computeTax(0, income)); // 0: Single, as in bachelor abi spinster

            System.out.printf("%-16.2f", computeTax(1, income)); // 1: Married Joint

            System.out.printf("%-16.2f", computeTax(2, income)); // 2: Married separated that kind of thing

            System.out.printf("%-16.2f", computeTax(3, income)); // 3: Head of House as in papa or baba
            
            System.out.println(); 
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0.0;

        
        if (status == 0) {
            if (taxableIncome <= 10000) {
                tax = taxableIncome * 0.10; 
            } else if (taxableIncome <= 40000) {
                tax = taxableIncome * 0.15; 
            } else if (taxableIncome <= 60000) {
                tax = taxableIncome * 0.25; 
            } else {
                tax = taxableIncome * 0.28; 
            }
        } 
        
        
        else if (status == 1) {
            if (taxableIncome <= 10000) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 40000) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome <= 60000) {
                tax = taxableIncome * 0.25;
            } else {
                tax = taxableIncome * 0.28;
            }
        } 
        
        
        else if (status == 2) {
            if (taxableIncome <= 10000) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 40000) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome <= 60000) {
                tax = taxableIncome * 0.25;
            } else {
                tax = taxableIncome * 0.28;
            }
        } 
        
        
        else if (status == 3) {
            if (taxableIncome <= 10000) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 40000) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome <= 60000) {
                tax = taxableIncome * 0.25;
            } else {
                tax = taxableIncome * 0.28;
            }
        }

        return tax;
    }
}
