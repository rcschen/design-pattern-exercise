package com.visitor.visitable;
import com.visitor.visitor.VisitorItf;

public class Member extends Customer{
	public void doMember() {
        System.out.println("會員服務");
    }
	
	@Override
	public void accept(VisitorItf v){
		v.visit(this);
	} 
}