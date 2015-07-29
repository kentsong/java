package note.pattern.behavioral.State;

import note.pattern.behavioral.State.sample.TrafficLight;

/**
 * state模式考慮讓每個狀態各自成為一個物件，負責自己該狀態的服務，並提供切換狀態的方法。
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
