package note.pattern.behavioral.Command.sample.draw;

import note.pattern.behavioral.Command.sample.Drawing;


public class DrawingImpl implements Drawing {

	public void processSome() {
        System.out.println("    - ��Ϥ��@ Some �B�z");
    }
    public void processOther() {
        System.out.println("    - ��Ϥ��@ Other �B�z");
    }
    public void processAnother() {
        System.out.println("    - ��Ϥ��@ Another �B�z");
    }

}
