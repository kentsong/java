package note.pattern.behavioral.Command.sample;

import java.util.HashMap;
import java.util.Map;

import note.pattern.behavioral.Command.sample.draw.DrawingImpl;

public class ImageService {
	private Map<String, ICommand> commands = new HashMap<String, ICommand>();
    private Drawing drawing = new DrawingImpl();
    public void addCommand(String effect, ICommand command) {
        commands.put(effect, command);
    }
    public void doEffect(String effect) {
        commands.get(effect).execute(drawing);
    }
}
