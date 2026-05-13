package meinburger.ingredients;

public class Patty extends Ingredients{
	
	private double bratzeit; 
	private int hoehe; 
	

	public Patty(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, double bratzeit, int hoehe) {
		super(number, name, price, classic, vegan, vegetarian);
		this.bratzeit = bratzeit; 
		this.hoehe=hoehe; 
		
	}
	

	@Override
	public int zubereiten() {
		//hier noch dei bratzeit irgednwie in minuten und sekunden aufteilen 
		System.out.println(name+ " wird von jeder Seite für " +bratzeit + " Minuten und " + bratzeit+ " Sekunden gegrillt");
		return (int) (bratzeit);
		
	}

	@Override
	public float berechneHoehe() {
		return (float) (hoehe * (1+ 0.035 * bratzeit));
		
		
	}

}
