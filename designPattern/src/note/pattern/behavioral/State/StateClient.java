package note.pattern.behavioral.State;

import note.pattern.behavioral.State.sample.TrafficLight;

/**
 * state�Ҧ��Ҽ{���C�Ӫ��A�U�ۦ����@�Ӫ���A�t�d�ۤv�Ӫ��A���A�ȡA�ô��Ѥ������A����k�C
 * @author 635_kentsong
 */

public class StateClient {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
        while(true) {
            trafficLight.change();
        }
	}
}
