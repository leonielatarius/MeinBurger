package meinburger;


public class Sortiment {
	/*
	 * Hier kommen alle Ingredeints rein als Arrays
	 * so kann man flexibel dei Kart eanpassen 
	 */
	
	//BUrger Brötchen 
	private Ingredients[] buns; 
	private Ingredients[] salads; 
	private Ingredients[] sauces; 
	private Ingredients[] pattys; 
	private Ingredients[] vegetables; 
	
	public Sortiment() {
	
	//Brötchen
	buns = new Ingredients[4];
	
	buns[0] = new Bun (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	buns[1] = new Bun (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	buns[2] = new Bun (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	buns[3] = new Bun (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	
	//Salate
	salads = new Ingredients[2];
	
	salads[0] =  new Salad (10, "Hamburger Standard", 0.85f , true, false, true );
	salads[1] =  new Salad (10, "Hamburger Standard", 0.85f , true, false, true );
	
	//Saucen 
    sauces = new Ingredients[4];
    
	sauces[0] =  new Sauce (10, "Hamburger Standard", 0.85f , true, false, true, 0, null );
	sauces[1] =  new Sauce (10, "Hamburger Standard", 0.85f , true, false, true, 0, null );
	sauces[2] =  new Sauce (10, "Hamburger Standard", 0.85f , true, false, true, 0, null );
	sauces[3] =  new Sauce (10, "Hamburger Standard", 0.85f , true, false, true, 0, null );
	
	//Pattys

     pattys = new Ingredients[4];
	
	pattys[0] =  new Patty (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	pattys[1] =  new Patty (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	pattys[2] =  new Patty (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	pattys[3] =  new Patty (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	
	//vegetables 
    vegetables = new Ingredients[4];
    
	vegetables[0] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[1] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[2] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[3] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
 }
}
