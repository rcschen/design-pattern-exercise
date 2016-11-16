package com.visitor.visitable;

import com.visitor.visitor.VisitorItf;

public interface VisitableItf {
	public void accept(VisitorItf v);
}