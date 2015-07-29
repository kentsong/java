package note.pattern.behavioral.Command.sample.command;

import note.pattern.behavioral.Command.sample.Drawing;
import note.pattern.behavioral.Command.sample.ICommand;

public class CEffectCommand implements ICommand {

	@Override
	public void execute(Drawing drawing) {
		System.out.println("�s�@C�S��");
		drawing.processOther();
		drawing.processAnother();
		drawing.processSome();
	}

}
