package binary_search;
import java.util.*;
public class Celling_number 
{
	public static void main(String[]args)
	{
		int arr[]= {1,3,6,9,11,12,14};
		int key=9;
		binarysearch(arr,key);
		int result=binarysearch(arr,key);
		System.out.println(result);
		
	}
	public static int binarysearch(int arr[],int key)
	{
		int start=0;
		int end =arr.length-1;
		
		while (start<=end)
		{
			int mid = (start+(end-start)/2);
			if(key==arr[mid])
			{
				return arr[mid];
			}
			
			if (key<arr[mid])
			{
				end=mid-1;
			}
			else if(key>arr[mid])
			{
				start=mid+1;
				int res=arr[mid];
			}
			
			mid=start+(end-start)/2;
		}
		return -1;
	}

}
