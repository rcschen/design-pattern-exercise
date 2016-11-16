package com.visitor;

import com.visitor.visitor.VisitorItf;
import com.visitor.visitor.VisitorImp;
import com.visitor.visitable.Customer;
class Service {
	private VisitorItf visit = new VisitorImp();
	void doService(Customer c){
		c.doCustomer();
		c.accept(visit);
		c.pay();
	}
	
}