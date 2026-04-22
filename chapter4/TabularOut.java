public class TabularOut {
    public static void main(String[] args) {
        // Print the table headers
        System.out.println("N      N2        N      N4\n");

        // Loop from 1 to 5
        int n = 1;
        while (n <= 5) {
            // Calculate the powers and print them separated by tabs
            System.out.printf("%d\t%d\t%d\t%d%n", n, (n * n), (n * n * n), (n * n * n * n));
            n++;
        }
    }
}
