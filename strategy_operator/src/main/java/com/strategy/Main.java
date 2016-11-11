package com.strategy;

import com.strategy.context.Context;
import com.strategy.SelectStrategy;
public class Main {
   public static void main(String[] args) {
          SelectStrategy selector = new SelectStrategy();
          Context context = new Context(selector.getStrategy("add"));      
          int result = context.executeStrategy(10, 20);
          System.out.println(result);
          context.setStrategy(selector.getStrategy("mul"));
          result = context.executeStrategy(result, 20);
          System.out.println(result);

   }
}