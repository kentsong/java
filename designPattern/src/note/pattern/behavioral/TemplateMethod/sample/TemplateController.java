package note.pattern.behavioral.TemplateMethod.sample;

public abstract class TemplateController {

	protected String desc;
	protected int numA = 20;
	protected int numB = 10;
	protected int numC = 5;
	
	public void process(){
		System.out.println("====�y�{�}�l====");
		System.out.println("====numA * numB + numC====");
		System.out.println(desc);
		this.calculate();
		System.out.println("====�y�{����====");
	}
	protected abstract void calculate();
	
	
}
