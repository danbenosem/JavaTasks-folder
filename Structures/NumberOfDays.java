public class NumberOfDays {
    public static void main(String[] args) {
      
        for (int year = 2014; year <= 2034; year++) {
            System.out.printf("%d has %d days%n",year, numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        // A leap year is divisible by 4 (but not 100), OR divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366; 
        } else {
            return 365;
        }
    }
}
