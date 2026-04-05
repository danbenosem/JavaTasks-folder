    import java.util.Scanner;

public class GradeChecker{


    public static void main(String [] args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the Grade:");
int grade= sc.nextInt();

if (grade >= 90 && grade<100){
    System.out.print("Grade A");

} else if (grade >= 80 && grade<90){
    System.out.print("Grade B");

} else if (grade >= 70 && grade<80){
    System.out.print("Grade C");

} else if (grade >= 60 && grade<70){
    System.out.print("Grade D");

} else{
        System.out.print("Grade F");
}

    




    









}




}
