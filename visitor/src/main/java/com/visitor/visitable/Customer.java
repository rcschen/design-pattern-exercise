package com.visitor.visitable;

import com.visitor.visitor.VisitorItf;

public class Customer implements VisitableItf {
	
	public void accept(VisitorItf v){
		
	}
    public void doCustomer() {
        System.out.println("客戶服務");
    }
    public void pay() {
        System.out.println("結帳");
    }
	
}