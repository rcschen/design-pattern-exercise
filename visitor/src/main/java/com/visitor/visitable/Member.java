package com.visitor.visitable;
import com.visitor.visitor.VisitorItf;

public class Member extends Customer{
	public void doMember() {
        System.out.println("�|���A��");
    }
	
	@Override
	public void accept(VisitorItf v){
		v.visit(this);
	} 
}