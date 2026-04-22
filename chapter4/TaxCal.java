import java.util.Scanner;

public class TaxCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter  name: ");
            String name = input.next();
            
         System.out.print("Enter amount");
              double amount = input.nextDouble();

             double tax;
            
            
            if (earnings <= 30000) {
                tax = amount * 0.15;
            } 

  else {
                tax = (30000 * 0.15) + ((amount - 30000) * 0.20);
            }

               System.out.printf("%s total tax is: $%f%n", name, tax);
            
        }
        
        
    }
}
