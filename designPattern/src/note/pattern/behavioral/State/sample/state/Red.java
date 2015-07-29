package note.pattern.behavioral.State.sample.state;

import note.pattern.behavioral.State.sample.TrafficLight;

public class Red extends Light {

	@Override
	public void change(TrafficLight light) {
		 System.out.println("紅燈");
         sleep(5000);
	     light.set(new Green()); // 如果考慮彈性調整狀態，可以不用寫死狀態物件設定

	}

}
