package note.pattern.behavioral.TemplateMethod.sample;

public class ControllerA extends TemplateController {

	public ControllerA(){
		this.desc = "方式:先乘除後加減";
	}
	
	
	@Override
	public void calculate() {
		System.out.println("result:"+ (this.numA * this.numB + this.numC) );

	}

}
