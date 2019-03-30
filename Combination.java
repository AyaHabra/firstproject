public class Combination {
	
	
	public static long factory(long num)
	{
		long result=1;
		for(int i=1;i<=num;i++)
			result*=i;
		return result;
	}
	
	
	public static long factoryR(long num)
	{
		if((num==1 )||(num==0))
			return 1;
		else 
			return factory(num-1)*num;
	}  

	public static long combination(long n,long m)
	{
		return factory(n)/(factory(m)*factory(n-m));
	}

	
	System.out.println("It is a factory program");
System.out.println("It a test program");
}