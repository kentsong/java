package note.pattern.behavioral.Visitor;

import note.pattern.behavioral.Visitor.sample.Service;
import note.pattern.behavioral.Visitor.sample.customer.Member;
import note.pattern.behavioral.Visitor.sample.customer.VIP;

/**
 * Visitor 模式的目的，是將演算流程與所操作的物件之特定結構分離，這樣分離之後，針對特定物件的操作部份將集中在Visitor中管理，並可以隨時修 改操作。
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
