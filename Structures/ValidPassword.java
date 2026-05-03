import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;

        for (int character = 0; character < password.length(); character++) {
            char c = password.charAt(character);

            // Rule 2: Consists only of letters and digits
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                return false; 
            }

            // Count the digits for Rule 3
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // Rule 3: Must contain at least 3 digits
        if(digitCount>=3){
       return true;
  }   else {
          return false;
 }
    }




}
