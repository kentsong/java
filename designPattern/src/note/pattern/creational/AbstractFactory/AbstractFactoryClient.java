package note.pattern.creational.AbstractFactory;

import note.pattern.creational.AbstractFactory.sample.ShotStation;
import note.pattern.creational.AbstractFactory.sample.camera.Camera;
import note.pattern.creational.AbstractFactory.sample.camera.ICameraFactory;
import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.body.NikonBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;
import note.pattern.creational.AbstractFactory.sample.camera.lens.SigmaLen;

/**
 * �p�G�ݭn�@�եi�H�H�ɩ⴫������A�åB�Ʊ�i�H²��a �@���⴫�A�h�i�H�Ҽ{�ϥ�Abstract Factory�C
 * �Ҧp�����{�������P�]Look-and-feel�^���󪺽մ��A�N�OAbstract Factory�����γ��X�C
 * @author 635_kentsong
 */

public class AbstractFactoryClient {
	
	public static void main(String[] args) {
		//��l����v����
		ShotStation shotStation = new ShotStation();
		
		//�����v����
		ICameraFactory cameraFactory = new Camera(){
			 public IBody getBody() {
                 //return new CanonBody("5D MarkIII" ,"full Frame");
				 return new NikonBody("D5500" ,"APS-C");
             }
             
             public ILens getLens() {
                 return new SigmaLen(50, 250);
             }
		};
		
		//�b��v�x�i����v
		shotStation.doShop(cameraFactory);

	}

}
