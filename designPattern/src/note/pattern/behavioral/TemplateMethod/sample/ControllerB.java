package note.pattern.behavioral.TemplateMethod.sample;

public class ControllerB extends TemplateController {

	public ControllerB(){
		this.desc = "�覡:���[��᭼��";
	}
	
	@Override
	protected void calculate() {
		System.out.println("result:"+ ( (this.numA + this.numB) * this.numC ));

	}

}
