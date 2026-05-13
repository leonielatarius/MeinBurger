package meinburger.ingredients;

public class Bun extends Ingredients{
	
	public double backzeit ; 
	public int hoehe;

	public Bun(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int hoehe, double backzeit) {
		super(number, name, price, classic, vegan, vegetarian);
		this.hoehe = hoehe; 
		this.backzeit = backzeit;
	}
	
	@Override
	
	public void zubereiten() {
		
		
		
	}

	@Override
	public void berechneHoehe() {
		// TODO Auto-generated method stub
		
	}

}
