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
	
	buns[0] = new Bun (10, "Hamburger Standard", 0.85f , false, false, true, 27, 1.5);
	buns[1] = new Bun (11, "Hamburger Sesam", 0.95f , false, false, true, 28, 1.5 );
	buns[2] = new Bun (12, "Vegan Brötchen", 0.55f , false, true, false, 0, 4 );
	buns[3] = new Bun (13, "Ciabatta", 0.45f , false, false, true, 0, 5.5 );
	
	//Salate
	salads = new Ingredients[2];
	
	salads[0] =  new Salad (30, "Eisbergsalad", 0.18f );
	salads[1] =  new Salad (31, "Ruccolasalad", 0.25f );
	
	//Saucen 
    sauces = new Ingredients[4];
    
	sauces[0] =  new Sauce (50, "Ketchup", 0.1f , false, true, false, 5, "normal" );
	sauces[1] =  new Sauce (51, "Sandwich-Sauce", 0.15f , false, false, true, 10, "normal");
	sauces[2] =  new Sauce (52, "Chili-Sauce", 0.25f , false, true, false, 8, "scharf" );
	sauces[3] =  new Sauce (53, "Honig-Senf-Sauce", 0.18f , false, false, true,8, "süß" );
	
	//Pattys

     pattys = new Ingredients[4];
	
	pattys[0] =  new Patty (20, "Rindfleisch (Original)", 1.85f , true, false, false, 0, 0 );
	pattys[1] =  new Patty (21, "Hähnchenfleisch gegrillt", 1.15f , true, false, false, 0, 0 );
	pattys[2] =  new Patty (22, "Falafel-Bratling", 1.45f , false, true, false, 0, 0 );
	pattys[3] =  new Patty (23, "Gemüse-Bratling", 1.75f , false, false, true, 0, 0 );
	
	//vegetables 
    vegetables = new Ingredients[4];
    
	vegetables[0] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[1] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[2] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
	vegetables[3] =  new Vegetable (10, "Hamburger Standard", 0.85f , true, false, true, 0, 0 );
 }
}
