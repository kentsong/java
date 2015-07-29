package note.pattern.behavioral.Visitor.sample.customer;

import note.pattern.behavioral.Visitor.sample.Visitor;

public class Member extends Customer {
	public void doMember() {
        System.out.println("�|���A��");
    }
	
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // �ݦ��h���A���O overload
    }    
}
