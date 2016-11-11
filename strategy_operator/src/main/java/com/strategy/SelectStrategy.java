package com.strategy;
import com.strategy.context.Context;
import com.strategy.strategy.*;


class SelectStrategy {
	public StrategyItf getStrategy(String type) {
		  if(type.equals("add") ) {
			  return new OperationAddImp();		
		  }
		  if(type.equals("sub")) {
			  return new OperationSubstractImp();	
		  }
	      return new OperationMultiplyImp();
	
	      
	}
	
}