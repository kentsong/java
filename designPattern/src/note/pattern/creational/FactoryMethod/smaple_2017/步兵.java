package note.pattern.creational.FactoryMethod.smaple_2017;

public class 步兵 implements Soldier{

	@Override
	public void attack() {
		System.out.println("步兵攻擊, 近距離攻擊");
		
	}

	@Override
	public void move() {
		System.out.println("步兵移動, 移動速度慢");
		
	}

}
