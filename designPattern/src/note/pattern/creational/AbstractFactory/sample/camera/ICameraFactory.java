package note.pattern.creational.AbstractFactory.sample.camera;

import note.pattern.creational.AbstractFactory.sample.camera.body.IBody;
import note.pattern.creational.AbstractFactory.sample.camera.lens.ILens;

public interface ICameraFactory {

	public IBody getBody();
	public ILens getLens();
}
