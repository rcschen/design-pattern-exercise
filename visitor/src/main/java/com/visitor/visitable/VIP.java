package com.visitor.visitable;

import com.visitor.visitor.VisitorItf;
public class VIP extends Customer{
	public void doVIP() {
        System.out.println("VIP�A��");
    }
	@Override
	public void accept(VisitorItf v){
		v.visit(this);
	} 
}