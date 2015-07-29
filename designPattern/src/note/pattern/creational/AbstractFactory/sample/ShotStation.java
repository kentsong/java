package note.pattern.creational.AbstractFactory.sample;

import note.pattern.creational.AbstractFactory.sample.camera.ICameraFactory;
import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;

//��v���x
public class ShotStation {

	public void doShop(ICameraFactory cameraFactory){
		IBody body = cameraFactory.getBody();
		ILens lens = cameraFactory.getLens();
		
		System.out.println("***********************");
		System.out.println("�}�l���!");
		System.out.println("�ϥξ���:"+body.getBobyInfo());
		System.out.println("�ϥ����Y:"+ lens.getMark() +", �̤p�J�q"+ lens.getLimitMM() +", �̤j�J�q:"+lens.getMaxMM());
	}
	
	
}
