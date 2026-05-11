package meinburger;

public class Burger {
	/*
	 * einzelne unterklassen die ableitenden von deisem bestehende buger auf der karte bilden 
	 * bzw je nach dem wie der burger zusammengestellt wird ist es anders 
	 * ich würde auch noch eine custo mfunktio  hinzufügen mit name your own burger , add to existing menü bc it sound sso tasty 
	 */
	
	protected String name ; 
	//das folgende muss wahrscheinlich ein Array sein 
	//protected String ingredeints ; 
	protected int price; 
	protected int height; 
	//schelife mit falls einer der ingredeints oben ungleich vegetraisch /vegan 
	protected String type; 
	//für das genauso eigntlich 
	protected String tasteProfile;
	
	//Konstruktor 
	public Burger(String name, int price, int height, String type, String tasteProfile) {
		super();
		this.name = name;
		this.price = price;
		this.height = height;
		this.type = type;
		this.tasteProfile = tasteProfile;
	} 
	//entwder für stajdard burger default construktor aber glaube eher weniger
	//oder man erstellt beim meü einfach standrad burger und andere auch mäßig als schon vorgegeben 
	//public Burger () {
	//this.name ="Standard Burger";
	
	//höhe des burgers gesmat 
	public void hoeheGesamt() {
		
	}
	//preis zusammenrechnen 
	public void preisGesamt() {
		
	}
	//je nach sauce wir der type halt anders also if
	public void tasteFestlegen() {
		
	}
	//je nach vegan ode rvegetarsiuch etc  wir der type halt anders also if
	public void typeFestlegen() {
		
	}
}

	
	
	


