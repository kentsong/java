package note.pattern.behavioral.Visitor.sample;

import note.pattern.behavioral.Visitor.sample.customer.Member;
import note.pattern.behavioral.Visitor.sample.customer.VIP;

//由Visiter 代理定義流程,可在這裡維護流程
public class VisitorImpl implements Visitor {

	@Override
	public void visit(Member member) {
		member.doMember();
	}

	@Override
	public void visit(VIP vip) {
		vip.doVIP();
	}

}
