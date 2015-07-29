package note.pattern.creational.SimpleFactory.sample;

import java.util.Date;

public class MessageFactory {
	public static Message getMessage(Model model) {
		Message msg = new Message();
		msg.setFrom(model.getFrom());
		msg.setSubject(model.getSubject());
		msg.setText(model.getText());
		msg.setTo(model.getTo());
		
		//�P�_�޿�i�H���æbSimpleFactory�̭�
		if(model.getDate() == null){
			msg.setDate(new Date());
		} else{
			msg.setDate(model.getDate());
		}
		

		return msg;
	}
}
