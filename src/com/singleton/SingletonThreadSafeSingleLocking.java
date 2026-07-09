package com.singleton;

public class SingletonThreadSafeSingleLocking {
	
	// Advantage
	//	Only one thread can execute at a time.

	// Disadvantage
	//	Performance overhead.
	//	Every call acquires lock.
	private static SingletonThreadSafeSingleLocking instance;
	
	private SingletonThreadSafeSingleLocking() { }
	
	public static synchronized SingletonThreadSafeSingleLocking getInstance( )
	{
		if(instance ==null)
		{
			instance=new SingletonThreadSafeSingleLocking();
		}		
		return instance;
	}
	
	public void show()
	{
		System.out.println(" Singleton Thread Safe With Single Locking");
	}
}


