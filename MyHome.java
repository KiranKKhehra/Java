package Sept22.assigystemnment2;

public class MyHome {

	private String bed= "queen";
	
	public void bedroom() {
		System.out.println(bed);
		
		PublicPark PP = new PublicPark();
		MyHome house = new MyHome();
		house.bedroom();
		System.out.println(PP.swing);
		System.out.println(PP.playground);
		
	}

}
