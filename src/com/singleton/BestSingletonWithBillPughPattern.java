package com.singleton;

public class BestSingletonWithBillPughPattern {
			
	// Benefits
	// 	✅ Lazy Loading
	//	✅ Thread Safe
	//	✅ No Synchronization Overhead
	//	✅ High Performance
	
	private BestSingletonWithBillPughPattern() { }
	
	private static class Holder {
		private static final BestSingletonWithBillPughPattern INSTANCE=new BestSingletonWithBillPughPattern();
	}
	
	public static BestSingletonWithBillPughPattern getInstance( )
	{
		return Holder.INSTANCE;
	}
	
	public void show()
	{
		System.out.println(" Singleton With Bill Pugh Pattern ");
	}

}


