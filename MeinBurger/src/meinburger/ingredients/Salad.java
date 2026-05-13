package meinburger.ingredients;

public class Salad extends Ingredients{

	public Salad(int number, String name, float price) {
		super(number, name, price, false, false, false);
		
	}

	@Override
	public int zubereiten() {
		System.out.println(name + " wird gewaschen und geschleudert");
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public float berechneHoehe() {
		return 0;
		
	}

}
