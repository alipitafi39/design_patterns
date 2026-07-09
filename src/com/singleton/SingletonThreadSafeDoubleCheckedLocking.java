package com.singleton;

public class SingletonThreadSafeDoubleCheckedLocking {
	
	// Without volatile another thread may get a partially initialized object.
	// Volatile prevents this issue.
	
	private static volatile  SingletonThreadSafeDoubleCheckedLocking instance;
	
	private SingletonThreadSafeDoubleCheckedLocking() { }
	
	public static SingletonThreadSafeDoubleCheckedLocking getInstance( )
	{
		if(instance ==null)
		{
			synchronized (SingletonThreadSafeDoubleCheckedLocking.class) {

                if(instance == null) {
                    instance = new SingletonThreadSafeDoubleCheckedLocking();
                }
            }
		}
		
		return instance;
	}
	
	public void show()
	{
		System.out.println(" Singleton Thread Safe With Double Locking");
	}
	

}


