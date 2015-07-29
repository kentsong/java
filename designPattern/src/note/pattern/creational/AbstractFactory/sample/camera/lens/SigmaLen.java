package note.pattern.creational.AbstractFactory.sample.camera.lens;

public class SigmaLen implements ILens{
	
	private final String mark = "SIGMA";
	private int limitMM;
	private int maxMM;
	
	public SigmaLen(int limitMM, int maxMM){
		this.limitMM = limitMM;
		this.maxMM = maxMM;
		
	}

	public String getLimitMM() {
		return "最小焦段:" + limitMM + "mm";
	}

	public String getMaxMM() {
		return "最大焦段:" + maxMM + "mm";
	}

	public String getMark() {
		return mark;
	}

	
	

	
}
