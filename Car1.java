package mar22.week1.day1;

public class Car1 {
	
	public void applyBrake()
	{
	System.out.println("applyingbrakes");
	}

	public void applyHonk()
	{
	System.out.println("applyingHorn");
	}


	public static void main(String[] args) {
		Car1 Toyota = new Car1();
		
		Toyota.applyBrake();
		Toyota.applyHonk();
		

	}

}
