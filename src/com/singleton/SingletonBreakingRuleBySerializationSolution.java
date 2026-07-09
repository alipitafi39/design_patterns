package com.singleton;

import java.io.Serializable;

public class SingletonBreakingRuleBySerializationSolution implements Serializable {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -8701880371547276247L;
	
	  private static final SingletonBreakingRuleBySerializationSolution INSTANCE =
	            new SingletonBreakingRuleBySerializationSolution();
	
	private SingletonBreakingRuleBySerializationSolution() { 
		System.out.println("Constructor Called"); 
	}
	
	public static SingletonBreakingRuleBySerializationSolution getInstance( )
	{
		return INSTANCE;
	}
	
	private Object readResolve() {
	        return INSTANCE;
	}

}


