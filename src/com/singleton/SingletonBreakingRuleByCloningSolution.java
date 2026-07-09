package com.singleton;

import java.io.Serializable;

public class SingletonBreakingRuleByCloningSolution implements Serializable {
	
	  private static final SingletonBreakingRuleByCloningSolution INSTANCE =
	            new SingletonBreakingRuleByCloningSolution();
	
	private SingletonBreakingRuleByCloningSolution() { 
		System.out.println("Constructor Called"); 
	}
	
	public static SingletonBreakingRuleByCloningSolution getInstance( )
	{
		return INSTANCE;
	}

	@Override
    protected Object clone()
            throws CloneNotSupportedException {

        throw new CloneNotSupportedException(
                "Singleton cannot be cloned");
    }
}


