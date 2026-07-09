package com.singleton;

import java.io.Serializable;

public class SingletonBreakingRuleBySerializationProblem implements Serializable {
	
	  private static final SingletonBreakingRuleBySerializationProblem INSTANCE =
	            new SingletonBreakingRuleBySerializationProblem();
	
	private SingletonBreakingRuleBySerializationProblem() { 
		System.out.println("Constructor Called"); 
	}
	
	public static SingletonBreakingRuleBySerializationProblem getInstance( )
	{
		return INSTANCE;
	}

}


