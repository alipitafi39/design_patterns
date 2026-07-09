package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class MainClass {

	public static void main(String[] args) {	
		try {
			singletonWithoutThreadSafe();
			singletonWithBillPughPattern();
            singletonThreadSafeWithSingleLocking();
			singletonThreadSafeWithDoubleLocking();
			singletonWithEnum();			
			singletonBreakingRuleByReflectionProblem();
			singletonBreakingRuleByReflectionSolution();
			singletonBreakingRuleBySerializationProblem();
			singletonBreakingRuleBySerializationSolution();
			singletonBreakingRuleByCloningProblem();
			singletonBreakingRuleByCloningSolution();
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}	
	
	private static void singletonWithoutThreadSafe()
	{
		  Singleton singleton =
				  Singleton.getInstance();

	        singleton.show();
	}
	
	private static void singletonWithBillPughPattern()
	{
		  BestSingletonWithBillPughPattern singleton =
				  BestSingletonWithBillPughPattern.getInstance();

	        singleton.show();
	}
	
	private static void singletonThreadSafeWithSingleLocking()
	{
		SingletonThreadSafeSingleLocking singleton =
				SingletonThreadSafeSingleLocking.getInstance();

	        singleton.show();
	}
	
	private static void singletonThreadSafeWithDoubleLocking()
	{
		SingletonThreadSafeDoubleCheckedLocking singleton =
				SingletonThreadSafeDoubleCheckedLocking.getInstance();

	        singleton.show();
	}
	
	private static void singletonWithEnum()
	{
		  SingletonByEnum singleton =
				  SingletonByEnum.INSTANCE;

	        singleton.show();
	}
	
	private static void singletonBreakingRuleByReflectionProblem() throws Exception
	{
		  SingletonBreakingRuleByReflectionProblem s1 = SingletonBreakingRuleByReflectionProblem.getInstance();

	        Constructor<SingletonBreakingRuleByReflectionProblem> constructor =
	        		SingletonBreakingRuleByReflectionProblem.class.getDeclaredConstructor();

	        constructor.setAccessible(true);

	        SingletonBreakingRuleByReflectionProblem s2 = constructor.newInstance();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);
	}
	
	private static void singletonBreakingRuleByReflectionSolution() throws Exception
	{
		  SingletonBreakingRuleByReflectionSolution s1 = SingletonBreakingRuleByReflectionSolution.getInstance();

	        Constructor<SingletonBreakingRuleByReflectionSolution> constructor =
	        		SingletonBreakingRuleByReflectionSolution.class.getDeclaredConstructor();

	        constructor.setAccessible(true);

	        SingletonBreakingRuleByReflectionSolution s2 = constructor.newInstance();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);
	}
	private static void singletonBreakingRuleBySerializationProblem() throws Exception
	{
		SingletonBreakingRuleBySerializationProblem s1 = SingletonBreakingRuleBySerializationProblem.getInstance();

	        ObjectOutputStream out =
	                new ObjectOutputStream(
	                        new FileOutputStream("data.ser"));

	        out.writeObject(s1);

	        ObjectInputStream in =
	                new ObjectInputStream(
	                        new FileInputStream("data.ser"));

	        SingletonBreakingRuleBySerializationProblem s2 =
	                (SingletonBreakingRuleBySerializationProblem) in.readObject();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);
	}
	
	private static void singletonBreakingRuleBySerializationSolution() throws Exception
	{
		SingletonBreakingRuleBySerializationSolution s1 = SingletonBreakingRuleBySerializationSolution.getInstance();

	        ObjectOutputStream out =
	                new ObjectOutputStream(
	                        new FileOutputStream("data.ser"));

	        out.writeObject(s1);

	        ObjectInputStream in =
	                new ObjectInputStream(
	                        new FileInputStream("data.ser"));

	        SingletonBreakingRuleBySerializationSolution s2 =
	                (SingletonBreakingRuleBySerializationSolution) in.readObject();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);
	}
	
	private static void singletonBreakingRuleByCloningProblem() throws Exception {
	
		SingletonBreakingRuleByCloningProblem s1 =
				SingletonBreakingRuleByCloningProblem.getInstance();

		SingletonBreakingRuleByCloningProblem s2 =
	                (SingletonBreakingRuleByCloningProblem) s1.clone();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);
	}
	
	private static void singletonBreakingRuleByCloningSolution() throws Exception {
	
		SingletonBreakingRuleByCloningSolution s1 =
				SingletonBreakingRuleByCloningSolution.getInstance();

		SingletonBreakingRuleByCloningSolution s2 =
	                (SingletonBreakingRuleByCloningSolution) s1.clone();

	        System.out.println(s1.hashCode());
	        System.out.println(s2.hashCode());

	        System.out.println(s1 == s2);		
	}
}
