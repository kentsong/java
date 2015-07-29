package note.pattern.behavioral.TemplateMethod;

import note.pattern.behavioral.TemplateMethod.sample.ControllerA;
import note.pattern.behavioral.TemplateMethod.sample.ControllerB;

/**
 * Template Method�Ҧ�(�k�ǥX�@�Ǧ@�P���y�{�B�J,�Ѥl���O��@)
 * �b��H�����O���w�q�n�Y�Ӿާ@������y�{�A�Ӧb�l���O���~�N�y�{���@�ǥ��w���ާ@��{�X��
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
