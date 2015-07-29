package note.pattern.behavioral.State.sample.state;

import note.pattern.behavioral.State.sample.State;
import note.pattern.behavioral.State.sample.TrafficLight;

public abstract class Light implements State{
	public abstract void change(TrafficLight light);
    protected void sleep(int second) {
        try {
            Thread.sleep(second);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
