package note.pattern.behavioral.State.sample.state;

import note.pattern.behavioral.State.sample.TrafficLight;

public class Yellow extends Light {

	@Override
	public void change(TrafficLight light) {
		System.out.println("¶À¿O");
        sleep(1000);
        light.set(new Red());

	}

}
