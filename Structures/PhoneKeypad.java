import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phone number string: ");
        String phone = input.nextLine();

        
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
             char ch2= Character.toUpperCase(ch);
            
            if (Character.isLetter(ch2)) {
                System.out.print(getNumber(ch2));
            } else {
                
                System.out.print(ch2);
         
               }
        }
     

   System.out.println();


    }

    

   public static int getNumber(char uppercaseLetter) {

    if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
        return 9; 

    } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {

        return 8; 
    } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
        return 7; 

    } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
        return 6; 

    } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
        return 5; 

    } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
        return 4;

    } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
        return 3; 

    } else if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
        return 2; 

    } else {
        return 0; 
    }
}


}
