package com.visitor.visitable;

import com.visitor.visitor.VisitorItf;

public class Customer implements VisitableItf {
	
	public void accept(VisitorItf v){
		
	}
    public void doCustomer() {
        System.out.println("�Ȥ�A��");
    }
    public void pay() {
        System.out.println("���b");
    }
	
}