import java.util.Scanner;

public class LowerCase {


    public static void main(String [] args){

            Scanner inputCollector = new Scanner(System.in);
            System.out.print("Enter a lower case chracter:");
            char letter = inputCollector.nextLine().charAt(0);


if (letter=='a' || letter == 'b' || letter =='c'){
   

        System.out.print(" keypad number is 2");



}else  if (letter=='d' || letter == 'e' || letter =='f'){
   

        System.out.print(" keypad number is 3");



}
else  if (letter=='g' || letter == 'h' || letter =='i'){
   

        System.out.print(" keypad number is 4");



} else  if (letter=='j' || letter == 'k' || letter =='l'){
   

        System.out.print(" keypad number is 5");



}else  if (letter== 'm'|| letter =='n'|| letter =='o'){
   

        System.out.print(" keypad number is 6");



}else  if (letter=='p' || letter == 'q' || letter == 'r'|| letter == 's'){
   

        System.out.print(" keypad number is 7");



} else  if (letter== 't' || letter == 'u' || letter == 'v' ){
   

        System.out.print(" keypad number is 8");



} else  if (letter== 'w' || letter == 'x'|| letter =='y' || letter == 'z'){
   

        System.out.print(" keypad number is 9");



} else{


System.out.print(" invalid non letters");
}




    



    


    
    }





}
