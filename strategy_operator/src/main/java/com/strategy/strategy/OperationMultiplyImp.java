package com.strategy.strategy;

public class OperationMultiplyImp implements StrategyItf{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}