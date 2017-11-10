package note.pattern.creational.FactoryMethod.smaple_2017;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Soldier soldier1 = SoldierFactory.createSoilder(SoldierFactory.SOLDIER_步兵);
		soldier1.attack();
		soldier1.move();
		System.out.println("----------------------");
		
		Soldier soldier2 = SoldierFactory.createSoilder(SoldierFactory.SOLDIER_弓兵);
		soldier2.attack();
		soldier2.move();
		System.out.println("----------------------");
		
		Soldier soldier3 = SoldierFactory.createSoilder(SoldierFactory.SOLDIER_騎兵);
		soldier3.attack();
		soldier3.move();
		System.out.println("----------------------");
	}

}
