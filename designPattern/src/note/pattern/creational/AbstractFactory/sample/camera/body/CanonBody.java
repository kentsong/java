package note.pattern.creational.AbstractFactory.sample.camera.body;

public class CanonBody implements IBody{

	private final String mark = "Canon";
	private String type;
	private String sensor;
	
	public CanonBody(String type, String sensor){
		this.type = type;
		this.sensor = sensor;
	}
	
	@Override
	public String getBobyInfo() {
		return mark +" " + type +", 感光元件:"+ sensor;
	}

}
