package note.pattern.behavioral.TemplateMethod.sample;

public class ControllerA extends TemplateController {

	public ControllerA(){
		this.desc = "�覡:��������[��";
	}
	
	
	@Override
	public void calculate() {
		System.out.println("result:"+ (this.numA * this.numB + this.numC) );

	}

}
