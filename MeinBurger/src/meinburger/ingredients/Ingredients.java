package meinburger.ingredients;

public  abstract class Ingredients {
/*
 * Abstrakte Oberklasse für alle Zutaten 
 */
	protected int number ; 
	protected String name ; 
	protected float price; 
	protected boolean classic; 
	protected boolean vegan; 
	protected boolean vegetarian ;
	protected boolean standard;
	
	//Konstruktor
	public Ingredients(int number, String name, float price, boolean classic, boolean vegan, boolean vegetarian) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.classic = classic;
		this.vegan = vegan;
		this.vegetarian = vegetarian;
		this.standard = standard; 
	} 
	
	//Methoden
	//Zubereitung der Zutat 
	public abstract  void zubereiten();
	
	//Höhe der Zutat 
	public abstract void berechneHoehe();
	
	@Override
	public String toString() {
		return null;
		
	}
	

	
}
