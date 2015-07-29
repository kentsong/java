package note.pattern.behavioral.Visitor.sample;

import note.pattern.behavioral.Visitor.sample.customer.Member;
import note.pattern.behavioral.Visitor.sample.customer.VIP;

public interface Visitor {
	public void visit(Member member);
	public void visit(VIP vip);
}
