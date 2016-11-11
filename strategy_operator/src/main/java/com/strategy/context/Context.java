package com.strategy.context;
import com.strategy.strategy.StrategyItf;

public class Context {
   private StrategyItf strategy;

   public Context(StrategyItf strategy){
      this.strategy = strategy;
   }
   
   public void setStrategy(StrategyItf strategy){
	   this.strategy=strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}