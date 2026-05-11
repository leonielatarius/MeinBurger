package meinburger;

public class Bun extends Ingredients{
	
	public int backzeit ; 
	public int hoehe;

	public Bun(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int hoehe, int backzeit) {
		super(number, name, price, classic, vegan, vegetarian);
		this.hoehe = hoehe; 
		this.backzeit = backzeit;
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
