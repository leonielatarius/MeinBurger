package meinburger;

public class Patty extends Ingredients{
	
	public int bratzeit; 
	public int hoehe; 
	

	public Patty(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int bratzeit, int hoehe) {
		super(number, name, price, classic, vegan, vegetarian);
		this.bratzeit = bratzeit; 
		this.hoehe=hoehe; 
		
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
