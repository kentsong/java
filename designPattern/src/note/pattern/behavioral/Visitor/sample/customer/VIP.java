package note.pattern.behavioral.Visitor.sample.customer;

import note.pattern.behavioral.Visitor.sample.Visitor;

public class VIP extends Customer {
	public void doVIP() {
        System.out.println("VIP 服務");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 看似多型，其實是 overload
    }    
}
