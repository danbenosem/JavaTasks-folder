public class Backtosender{




 public int payment(int rate){
int wage=0;

        if (rate < 50){
         wage = (rate*160) + 5000;

} else if (rate >= 50 && rate < 59){
         wage = (rate*200) + 5000;

} else if (rate >= 60 && rate < 69){
         wage = (rate*250) + 5000;

} else if (rate >= 70){
         wage = (rate*500) + 5000;

}

      return wage;  







}






}



