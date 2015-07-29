package note.pattern.behavioral.State.sample.state;

import note.pattern.behavioral.State.sample.TrafficLight;

public class Green extends Light {

	@Override
	public void change(TrafficLight light) {
		  System.out.println("ºñ¿O");
	      sleep(5000);
	      light.set(new Yellow());
	}

}
