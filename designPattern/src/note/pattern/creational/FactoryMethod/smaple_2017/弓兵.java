package note.pattern.creational.FactoryMethod.smaple_2017;

public class 弓兵 implements Soldier {

	@Override
	public void attack() {
		System.out.println("弓兵攻擊, 遠距離射擊");
	}

	@Override
	public void move() {
		System.out.println("弓兵移動, 移動速度慢");
		
	}

}
