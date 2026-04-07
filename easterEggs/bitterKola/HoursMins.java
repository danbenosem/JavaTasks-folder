import java.util.Scanner;

public class HoursMins {

    public static void main (String [] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the time in hours:");
    int hours = sc.nextInt();

    System.out.print("Enter the time in mins:");
    int mins = sc.nextInt();

 System.out.print("Enter the time in hours:");
    int hours1 = sc.nextInt();

    System.out.print("Enter the time in mins:");
    int mins1 = sc.nextInt();

int time1=0;
int time2=0;

int time3 =0;
int time4 = 0;

    if(hours>23 ){

 time1= 24 -hours;





} else{

time1=hours;


}

if ( mins > 59 ){

time2=  mins % 60;





} else {
time2= mins;


}


if  (hours1>23){
time3 = 24- hours1;

}
else {

time3 = hours1;


}



if ( mins1>59){

time4 = mins1%60;

}

else{



time4 = mins1;
}


System.out.printf("%d:%d%n",time1,time2);
System.out.printf("%d:%d",time3,time4);

int totalHours= time1+time3;
int totalMins = time2 + time4;
int totalmins1=0;


if (totalMins>59){

totalmins1=totalMins/60;
totalMins= totalMins%60;

} 
int totalHours1 = totalHours + totalmins1;
System.out.printf("%nthe total time is %d hours %d minute(s)",totalHours1, totalMins);






    }






}
