public class Combination {
	
	
	public static long factory(long num)
	{
		long result=1;
		for(int i=1;i<=num;i++)
			result*=i;
		return result;
	}
	
	
	
	public static long combination(long n,long m)
	{
		return factory(n)/(factory(m)*factory(n-m));
	}
	
	