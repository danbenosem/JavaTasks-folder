public class DistanceConversion {




     public static void main(String[] args) {
        
        
        System.out.println("Miles    Kilometers     |    Kilometers    Miles");
        System.out.println("-------------------------------------------------");
        
        
        for (int number = 1; number <= 10; number++) {
            
            
            double miles = number;
            double km = mileToKilometer(miles);
            

            double km2 = number; 
            double miles2 = kilometerToMile(km2);
            
            
            System.out.printf("%-10.1f%-14.3f|      %6.1f    %7.3f\n", miles, km, km2, miles2);
        }
    }



    
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }

    
    
}
