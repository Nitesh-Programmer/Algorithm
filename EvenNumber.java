package linearSearch;

public class EvenNumber 
{
	static int digits(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	static boolean even(int num)
	{
		int numOfDigits=digits(num);
		return numOfDigits%2==0;
	}
	static int findNumber(int []arr)
	{
		int count=0;
		for(int num:arr)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int []arr= {121,345,2,6,789};
		System.out.println(findNumber(arr));
	}
}
