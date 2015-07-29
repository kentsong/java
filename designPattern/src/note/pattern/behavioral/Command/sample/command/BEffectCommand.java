package note.pattern.behavioral.Command.sample.command;

import note.pattern.behavioral.Command.sample.Drawing;
import note.pattern.behavioral.Command.sample.ICommand;

public class BEffectCommand implements ICommand {

	@Override
	public void execute(Drawing drawing) {
		System.out.println("製作B特效");
		drawing.processOther();
		drawing.processAnother();

	}

}
