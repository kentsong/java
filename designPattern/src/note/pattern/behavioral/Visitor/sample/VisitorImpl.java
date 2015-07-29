package note.pattern.behavioral.Visitor.sample;

import note.pattern.behavioral.Visitor.sample.customer.Member;
import note.pattern.behavioral.Visitor.sample.customer.VIP;

//��Visiter �N�z�w�q�y�{,�i�b�o�̺��@�y�{
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
