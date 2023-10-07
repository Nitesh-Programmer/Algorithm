package linearSearch;

public class FirstProgram 
{

	public static void main(String[] args) 
	{
		int []arr= {2,7,42,72,12,45,21};
		int target=21;
		System.out.println(linearSearch(arr,target));
	}
	static int linearSearch(int []arr,int target)
	{
		if(arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
