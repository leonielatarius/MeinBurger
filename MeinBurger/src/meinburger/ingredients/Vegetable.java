package meinburger.ingredients;

public class Vegetable extends Ingredients{
	
	private int scheibenDicke;
	private int scheibenAnzahl;

	public Vegetable(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian, int scheibenAnzahl, int scheibenDicke) {
		super(number, name, price, classic, vegan, vegetarian);
		this.scheibenAnzahl=scheibenAnzahl; 
		this.scheibenDicke=scheibenDicke; 
	}

	@Override
	public int zubereiten() {
		System.out.println(name + " wird gewaschen.");
		for (int i = 1 ; i<=scheibenAnzahl; i++) {
			System.out.println(" Die "+i + ". Scheibe wird mit " + scheibenDicke + " mm geschnitten ");
		}
		return scheibenAnzahl;
	}
	@Override
	public float berechneHoehe() {
		return (scheibenAnzahl * scheibenDicke);
		
		
	}

}
