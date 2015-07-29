package note.pattern.creational.SimpleFactory;

import note.pattern.creational.SimpleFactory.sample.Message;
import note.pattern.creational.SimpleFactory.sample.MessageFactory;
import note.pattern.creational.SimpleFactory.sample.Model;

/**
 * Simple Factory模式又稱Static Factory模式。
 * 一個Simple Factory生產成品，而對客戶端隱藏產品產生的細節，物件如何生成，
 * 生成前是否與其它物件建立依賴關係，客戶端皆不用理會，用以將物件生成方式之變化 與客戶端程式碼隔離。
 * @author 635_kentsong
 */

public class SimpleFactoryClient {

	public static void main(String[] args){
		//封裝前端參數
		Model model = new Model();
		model.setFrom("kent_song@gmailc.com");
		model.setTo("abc@hotmail.com");
		
		//需要Message物件直接從SimpleFactory拿
		Message msg = MessageFactory.getMessage(model);
		System.out.println("******************");
		System.out.println("msg.getFrom():" + msg.getFrom());
		System.out.println("msg.getTo():" + msg.getTo());
		System.out.println("msg.getDate():" + msg.getDate());
	}
}
