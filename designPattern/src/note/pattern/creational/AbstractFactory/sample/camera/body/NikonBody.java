package note.pattern.creational.AbstractFactory.sample.camera.body;

public class NikonBody implements IBody {

	private final String mark = "Nikon";
	private String type;
	private String sensor;
	
	public NikonBody(String type, String sensor){
		this.type = type;
		this.sensor = sensor;
	}
	
	@Override
	public String getBobyInfo() {
		return mark +" " + type +", 感光元件:"+ sensor;
	}

}
