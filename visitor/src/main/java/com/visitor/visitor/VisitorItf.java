package com.visitor.visitor;
import com.visitor.visitable.Member;
import com.visitor.visitable.VIP;


public interface VisitorItf {
	public void visit(Member m);
	public void visit(VIP v);

}