package meinburger.ingredients;

public class Sauce extends Ingredients {
	
	private int menge; 
	private String geschmack; 

	public Sauce(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int menge, String geschmack) {
		super(number, name, price, classic, vegan, vegetarian);
		this.menge=menge; 
		//es gibt nur drei irgendwie hinzufügen 
		this.geschmack = geschmack; 
	}

	@Override
	public int zubereiten() {
		System.out.println(name + " wird geschüttelt");
		return 0;
			
	}

	
	

}
