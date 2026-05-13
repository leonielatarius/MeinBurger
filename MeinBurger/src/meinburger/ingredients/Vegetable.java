package meinburger.ingredients;

public class Vegetable extends Ingredients{
	
	public int scheibenDicke;
	public int scheibenAnzahl;

	public Vegetable(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int scheibenAnzahl, int scheibenDicke) {
		super(number, name, price, classic, vegan, vegetarian);
		this.scheibenAnzahl=scheibenAnzahl; 
		this.scheibenDicke=scheibenDicke; 
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
