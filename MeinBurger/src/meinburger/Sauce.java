package meinburger;

public class Sauce extends Ingredients {
	
	public int menge; 
	public String geschmack; 

	public Sauce(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int menge, String geschmack) {
		super(number, name, price, classic, vegan, vegetarian);
		this.menge=menge; 
		this.geschmack = geschmack; 
	}

	@Override
	public void zubereiten() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void berechneHoehe() {
		// TODO Auto-generated method stub
		
	}

}
