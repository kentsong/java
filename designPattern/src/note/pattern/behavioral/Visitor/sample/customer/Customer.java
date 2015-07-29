package note.pattern.behavioral.Visitor.sample.customer;

import note.pattern.behavioral.Visitor.sample.Visitable;
import note.pattern.behavioral.Visitor.sample.Visitor;

public abstract class Customer implements Visitable {

	public void doCustomer() {
        System.out.println("客戶服務");
    }
	
	public void pay() {
        System.out.println("結帳");
    }
	
	@Override
	public void accept(Visitor visitor) {
		//do not thing
	}

}
