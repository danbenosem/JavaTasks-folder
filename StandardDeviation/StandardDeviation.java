public class StandardDeviation{



	
  public static int deviate(){

    return 0;

   }


	public static double standard(int...numbers){
	
	  int [] array = new int[numbers.length];
	  
	  
	  for (int index = 0; index < numbers.length; index++) {
        array[index] = numbers[index]; 
    }
	

	  
	  int sum = 0;
		
		for(int index=0; index<numbers.length; index++){
		
		
			sum+= array[index];
		
		
		}
		
		int mean=  sum/numbers.length;
		
	double [] array2= new double [numbers.length];
	
	for(int index=0; index<numbers.length; index++){
		
		
			array2[index]= Math.pow((array[index]-mean),2);
		
		
		}
	
		double total=0;
		
		
		for(int index=0; index<numbers.length; index++){
		
		
			total +=array2[index];
		
		
		}
		
   
		double variance= total/numbers.length;
		
		
		double standard= Math.sqrt(variance );
		
		
		
		return standard;
		
		
		
	
	
	
	}










}
