package note.pattern.creational.SimpleFactory.sample;

import java.util.Date;

public class MessageFactory {
	public static Message getMessage(Model model) {
		Message msg = new Message();
		msg.setFrom(model.getFrom());
		msg.setSubject(model.getSubject());
		msg.setText(model.getText());
		msg.setTo(model.getTo());
		
		//判斷邏輯可以隱藏在SimpleFactory裡面
		if(model.getDate() == null){
			msg.setDate(new Date());
		} else{
			msg.setDate(model.getDate());
		}
		

		return msg;
	}
}
