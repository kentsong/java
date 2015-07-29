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
		return "�̤p�J�q:" + limitMM + "mm";
	}

	public String getMaxMM() {
		return "�̤j�J�q:" + maxMM + "mm";
	}

	public String getMark() {
		return mark;
	}

	
	

	
}
