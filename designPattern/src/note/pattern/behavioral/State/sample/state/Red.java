package note.pattern.behavioral.State.sample.state;

import note.pattern.behavioral.State.sample.TrafficLight;

public class Red extends Light {

	@Override
	public void change(TrafficLight light) {
		 System.out.println("���O");
         sleep(5000);
	     light.set(new Green()); // �p�G�Ҽ{�u�ʽվ㪬�A�A�i�H���μg�����A����]�w

	}

}
