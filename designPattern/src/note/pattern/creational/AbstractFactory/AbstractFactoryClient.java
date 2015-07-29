package note.pattern.creational.AbstractFactory;

import note.pattern.creational.AbstractFactory.sample.ShotStation;
import note.pattern.creational.AbstractFactory.sample.camera.Camera;
import note.pattern.creational.AbstractFactory.sample.camera.ICameraFactory;
import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.body.NikonBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;
import note.pattern.creational.AbstractFactory.sample.camera.lens.SigmaLen;

/**
 * 如果需要一組可以隨時抽換的元件，並且希望可以簡單地 一次抽換，則可以考慮使用Abstract Factory。
 * 例如視窗程式中視感（Look-and-feel）元件的調換，就是Abstract Factory的應用場合。
 * @author 635_kentsong
 */

public class AbstractFactoryClient {
	
	public static void main(String[] args) {
		//初始化攝影環境
		ShotStation shotStation = new ShotStation();
		
		//選擇攝影器材
		ICameraFactory cameraFactory = new Camera(){
			 public IBody getBody() {
                 //return new CanonBody("5D MarkIII" ,"full Frame");
				 return new NikonBody("D5500" ,"APS-C");
             }
             
             public ILens getLens() {
                 return new SigmaLen(50, 250);
             }
		};
		
		//在攝影台進行攝影
		shotStation.doShop(cameraFactory);

	}

}
