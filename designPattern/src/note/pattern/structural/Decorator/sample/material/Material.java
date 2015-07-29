package note.pattern.structural.Decorator.sample.material;

public class Material implements IMaterial{

	protected String name;
	protected int price;
	
	public String getMaterialName() {
		return this.name;
	}

	public int getMaterialPrice() {
		return this.price;
	}
	
}
