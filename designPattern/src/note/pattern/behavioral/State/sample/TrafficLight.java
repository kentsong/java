package note.pattern.behavioral.State.sample;

import note.pattern.behavioral.State.sample.state.Red;

public class TrafficLight {
	private State current = new Red();
	
    public void set(State state) {
        this.current = state;
    }
    
    public void change() {
        current.change(this);
    }
}
