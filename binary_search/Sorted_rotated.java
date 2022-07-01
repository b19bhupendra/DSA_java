//Search an element in Sorted and Rotated arrays 

package binary_search;
import java.util.*;
public class Sorted_rotated 
{
	public static void main(String[]args)
	{
		  int arr[]= {5, 6, 7, 8, 9, 10, 1, 2, 3};
		  int key =30;
		  rotated(arr,key);
		  int ans=rotated(arr,key);
		  System.out.println(ans);
	}
	public static int rotated(int arr[],int key)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			
			if(arr[start]<=arr[mid])
			{
				if(key>=arr[start]&&key<=arr[mid])
				{
					end =mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(key>arr[mid]&&key<=arr[end])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
			
		}
		return -1;
	}

}
