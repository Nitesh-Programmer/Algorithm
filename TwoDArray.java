package linearSearch;

import java.util.Arrays;

public class TwoDArray 
{
	static int[] findElement(int [][]arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				{
					return new int [] {i,j};
				}
			}
		}
		return new int [] {-1,-1};
	}
	public static void main(String[] args) 
	{	
		int [][]arr= {{1,32,52,67,2},{52,64,72},{12,24,77,88},{91,94,71,69}};
		int target=121;
		int[] x=findElement(arr,target);
		System.out.println(Arrays.toString(x));
	}
}
