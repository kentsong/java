package note.pattern.behavioral.TemplateMethod;

import note.pattern.behavioral.TemplateMethod.sample.ControllerA;
import note.pattern.behavioral.TemplateMethod.sample.ControllerB;

/**
 * Template Method模式(歸納出一些共同的流程步驟,由子類別實作)
 * 在抽象父類別中定義好某個操作的整體流程，而在子類別中才將流程中一些未定的操作實現出來
 * @author 635_kentsong
 *
 */
public class TemplateMethodClient {

	public static void main(String[] args) {
		ControllerA controllerA = new ControllerA();
		controllerA.process();

		System.out.println("\n");
		
		ControllerB controllerB = new ControllerB();
		controllerB.process();
	}

}
