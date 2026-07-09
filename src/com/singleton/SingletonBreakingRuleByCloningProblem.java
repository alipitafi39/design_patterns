package com.singleton;

import java.io.Serializable;

public class SingletonBreakingRuleByCloningProblem implements Cloneable  {
	
	  private static final SingletonBreakingRuleByCloningProblem INSTANCE =
	            new SingletonBreakingRuleByCloningProblem();
	
	private SingletonBreakingRuleByCloningProblem() { 
		System.out.println("Constructor Called"); 
	}
	
	public static SingletonBreakingRuleByCloningProblem getInstance( )
	{
		return INSTANCE;
	}
	
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	      return super.clone();
	 }

}


