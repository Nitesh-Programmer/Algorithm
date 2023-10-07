package linearSearch;

public class Maxin2D 
{
	static int findMax(int [][]arr)
	{
		int max=arr[0][0];
		for(int[] row:arr)
		{
			for(int col:row)
			{
				max=col;
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		int [][]arr= {{12,31,56,83},{3,53,22},{11,75,72},{24,89,92}};
		System.out.println(findMax(arr));
	}
}
