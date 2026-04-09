import java.util.Scanner;


public class Ascii{



public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a letter:");

char user = sc.next().charAt(0);
char charc = 'A';
int asci = (int) charc;
 

while (charc<=user){

System.out.println(charc + "-" + asci);




charc++;
asci++;


}



}


}
