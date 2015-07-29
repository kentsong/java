package note.pattern.behavioral.Command;

import note.pattern.behavioral.Command.sample.ImageService;
import note.pattern.behavioral.Command.sample.command.AEffectCommand;
import note.pattern.behavioral.Command.sample.command.BEffectCommand;
import note.pattern.behavioral.Command.sample.command.CEffectCommand;

public class CommandClient {

	public static void main(String[] args) {
		 ImageService service = new ImageService();
         service.addCommand("AEffect", new AEffectCommand());
         service.addCommand("BEffect", new BEffectCommand());
         service.addCommand("CEffect", new CEffectCommand());
         // �b�ݭn�ɫ��w�ϥάY�S��
         service.doEffect("AEffect");
         service.doEffect("BEffect");
         service.doEffect("CEffect");

	}

}
