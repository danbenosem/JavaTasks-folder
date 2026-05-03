public class FactorialTest {
    public static void main(String[] args) {
        // Testing the scenarios from the problem
        System.out.println("factorial(0) returns: " + factorial(0)); // Expected: 1
        System.out.println("factorial(1) returns: " + factorial(1)); // Expected: 1
        System.out.println("factorial(5) returns: " + factorial(5)); // Expected: 120
        System.out.println("factorial(6) returns: " + factorial(6)); // Expected: 720
    }

    public static int factorial(int n) {
        int total = 1;
        // Loop from 1 up to 'n' and multiply the total
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }
}
 
