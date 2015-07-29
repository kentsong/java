package note.pattern.behavioral.Visitor.sample.customer;

import note.pattern.behavioral.Visitor.sample.Visitor;

public class VIP extends Customer {
	public void doVIP() {
        System.out.println("VIP �A��");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // �ݦ��h���A���O overload
    }    
}
