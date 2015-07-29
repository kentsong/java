package note.pattern.behavioral.Visitor.sample.customer;

import note.pattern.behavioral.Visitor.sample.Visitor;

public class Member extends Customer {
	public void doMember() {
        System.out.println("會員服務");
    }
	
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 看似多型，其實是 overload
    }    
}
