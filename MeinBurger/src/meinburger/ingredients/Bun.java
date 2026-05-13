package meinburger.ingredients;

public class Bun extends Ingredients{
	
	private double backzeit ; 
	private int hoehe;

	public Bun(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int hoehe, double backzeit) {
		super(number, name, price, classic, vegan, vegetarian);
		this.hoehe = hoehe; 
		this.backzeit = backzeit;
	}
	
	@Override
	public int zubereiten() {
		System.out.println(name+ " wird "+ backzeit + " Minuten geröstet und aufgeschnitten.");
		return (int) backzeit;
	
	}
	@Override
	public float berechneHoehe() {
		return (float) (hoehe * (1+ 0.0 * backzeit));
		
		
	}

}
