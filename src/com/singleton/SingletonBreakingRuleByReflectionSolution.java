package com.singleton;

public class SingletonBreakingRuleByReflectionSolution {
	
	  private static final SingletonBreakingRuleByReflectionSolution INSTANCE =
	            new SingletonBreakingRuleByReflectionSolution();
	
	private SingletonBreakingRuleByReflectionSolution() { 
		  if (INSTANCE != null) {
	            throw new RuntimeException(
	                    "Singleton already created");
	        } 
	}
	
	public static SingletonBreakingRuleByReflectionSolution getInstance( )
	{
		return INSTANCE;
	}

}


