package note.pattern.behavioral.Visitor;

import note.pattern.behavioral.Visitor.sample.Service;
import note.pattern.behavioral.Visitor.sample.customer.Member;
import note.pattern.behavioral.Visitor.sample.customer.VIP;

/**
 * Visitor �Ҧ����ت��A�O�N�t��y�{�P�Ҿާ@�����󤧯S�w���c�����A�o�ˤ�������A�w��S�w���󪺾ާ@�����N�����bVisitor���޲z�A�åi�H�H�ɭ� ��ާ@�C
 * @author 635_kentsong
 *
 */
public class VisitorClient {

	public static void main(String[] args) {
		 Service service = new Service();
	     service.doService(new Member());
	     System.out.print("\n");
	     service.doService(new VIP());

	}

}
