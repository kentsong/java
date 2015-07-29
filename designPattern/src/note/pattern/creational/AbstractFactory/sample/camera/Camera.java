package note.pattern.creational.AbstractFactory.sample.camera;

import note.pattern.creational.AbstractFactory.sample.camera.body.CanonBody;
import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;
import note.pattern.creational.AbstractFactory.sample.camera.lens.SigmaLen;

public class Camera implements ICameraFactory{

	public IBody getBody() {
		return new CanonBody("EOS 70D", "APS-C");
	}

	public ILens getLens() {
		return new SigmaLen(10, 18);
	}
	

}
