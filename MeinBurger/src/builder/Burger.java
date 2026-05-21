package builder;
//dhueue

public class Burger {
	/*
	 * einzelne unterklassen die ableitenden von deisem bestehende buger auf der karte bilden 
	 * bzw je nach dem wie der burger zusammengestellt wird ist es anders 
	 * ich würde auch noch eine custo mfunktio  hinzufügen mit name your own burger , add to existing menü bc it sound sso tasty 
	 */
	//DAS ARRAY MIT ZUATEN HINZUFÜGEN 
	
	private String name ; 
	//das folgende muss wahrscheinlich ein Array sein 
	//protected String ingredeints ; 
	private float price; 
	private float height; 
	//schelife mit falls einer der ingredeints oben ungleich vegetraisch /vegan 
	protected String type; 
	//für das genauso eigntlich 
	protected String tasteProfile;
	
	//Konstruktor 
	public Burger(String name) {
		this.name = name ; 
		
		
	} 
	//entwder für stajdard burger default construktor aber glaube eher weniger
	//oder man erstellt beim meü einfach standrad burger und andere auch mäßig als schon vorgegeben 
	//public Burger () {
	//this.name ="Standard Burger";
	
	//Add zutaten Methode (max 9 )
	
	
	//höhe des burgers gesmat 
	public float hoeheGesamt() {
		return 0;
		
	}
	//berechnung zubereitungszeit
	
	public int zeitGesamt() {
		return 0;
		
	}
	//preis zusammenrechnen 
	public float preisGesamt() {
		return 0;
		
	}
	//je nach sauce wir der type halt anders also if
	public String tasteFestlegen() {
		return null;
		
	}
	//je nach vegan ode rvegetarsiuch etc  wir der type halt anders also if
	public String typeFestlegen() {
		return null;
		
	}
	
}

	
	
	


