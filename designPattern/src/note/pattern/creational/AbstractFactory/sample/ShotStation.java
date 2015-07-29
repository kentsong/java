package note.pattern.creational.AbstractFactory.sample;

import note.pattern.creational.AbstractFactory.sample.camera.ICameraFactory;
import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;

//攝影平台
public class ShotStation {

	public void doShop(ICameraFactory cameraFactory){
		IBody body = cameraFactory.getBody();
		ILens lens = cameraFactory.getLens();
		
		System.out.println("***********************");
		System.out.println("開始拍照!");
		System.out.println("使用機身:"+body.getBobyInfo());
		System.out.println("使用鏡頭:"+ lens.getMark() +", 最小焦段"+ lens.getLimitMM() +", 最大焦段:"+lens.getMaxMM());
	}
	
	
}
