package note.pattern.creational.FactoryMethod.smaple_2017;

public class SoldierFactory {
	
	public final static int SOLDIER_步兵 = 1;  
	public final static int SOLDIER_弓兵 = 2;  
	public final static int SOLDIER_騎兵 = 3;  

	
	 public static Soldier createSoilder(int soldierType){
		switch(soldierType){
			case SOLDIER_步兵:
				return new 步兵();
			case SOLDIER_弓兵:
				return new 弓兵();
			case SOLDIER_騎兵:
				return new 騎兵();
			default:
				throw new RuntimeException("找不到對應的兵種");
		}
		 
	 }

}
