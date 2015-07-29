package note.pattern.behavioral.Command.sample.command;

import note.pattern.behavioral.Command.sample.Drawing;
import note.pattern.behavioral.Command.sample.ICommand;

public class AEffectCommand implements ICommand {

	@Override
	public void execute(Drawing drawing) {
		System.out.println("製作A特效");
		drawing.processSome();
		drawing.processAnother();
	}

}
