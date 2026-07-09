package com.singleton;

public class SingletonBreakingRuleByReflectionProblem {
	
	  private static final SingletonBreakingRuleByReflectionProblem INSTANCE =
	            new SingletonBreakingRuleByReflectionProblem();
	
	private SingletonBreakingRuleByReflectionProblem() { 
		System.out.println("Constructor Called"); 
	}
	
	public static SingletonBreakingRuleByReflectionProblem getInstance( )
	{
		return INSTANCE;
	}

}


