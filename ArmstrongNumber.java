package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputs=153, originalNumber, remainder, calculated=0;
		
		originalNumber= inputs;
		
		while(originalNumber !=0)
		{
			remainder=originalNumber%10;
			calculated += Math.pow(remainder, 3);
			
			originalNumber/=10;
		
		if (calculated== inputs)
				System.out.println(inputs + "is an Armstrong number");
		
		else
				System.out.println(inputs + "is not an Armstrong number");
	}

	}       
                
}             
                


	
