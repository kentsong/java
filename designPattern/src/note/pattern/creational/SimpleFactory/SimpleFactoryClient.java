package note.pattern.creational.SimpleFactory;

import note.pattern.creational.SimpleFactory.sample.Message;
import note.pattern.creational.SimpleFactory.sample.MessageFactory;
import note.pattern.creational.SimpleFactory.sample.Model;

/**
 * Simple Factory�Ҧ��S��Static Factory�Ҧ��C
 * �@��Simple Factory�Ͳ����~�A�ӹ�Ȥ�����ò��~���ͪ��Ӹ`�A����p��ͦ��A
 * �ͦ��e�O�_�P�䥦����إߨ̿����Y�A�Ȥ�ݬҤ��βz�|�A�ΥH�N����ͦ��覡���ܤ� �P�Ȥ�ݵ{���X�j���C
 * @author 635_kentsong
 */

public class SimpleFactoryClient {

	public static void main(String[] args){
		//�ʸ˫e�ݰѼ�
		Model model = new Model();
		model.setFrom("kent_song@gmailc.com");
		model.setTo("abc@hotmail.com");
		
		//�ݭnMessage���󪽱��qSimpleFactory��
		Message msg = MessageFactory.getMessage(model);
		System.out.println("******************");
		System.out.println("msg.getFrom():" + msg.getFrom());
		System.out.println("msg.getTo():" + msg.getTo());
		System.out.println("msg.getDate():" + msg.getDate());
	}
}
