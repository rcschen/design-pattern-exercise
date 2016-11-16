package com.visitor.visitor;
import com.visitor.visitable.Member;
import com.visitor.visitable.VIP;

public class VisitorImp implements VisitorItf{
	public void visit(Member m ){
		m.doMember();
	}
	public void visit(VIP v){
		v.doVIP();
	}
}