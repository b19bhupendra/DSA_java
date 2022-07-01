package binary_search;
import java.util.*;
public class Binary_search2 
{

	public static void main(String[]args)
	{
		int []arr= {50,40,30,20,10};
		int key=10;
		decending(arr,key);
		int ans = decending(arr,key);
		System.out.println(ans);
	}
	
	
	public static int decending(int arr[],int key)
	{
		int start=0;
		int end = arr.length-1;
		boolean isaccending =(arr[start] < arr[end]);	
	/*	if(arr[start] < arr[end])
		{
		isaccending =true;
		}
		else
		{
			isaccending =false;
		}
	*/
		int mid = (start +(end-start)/2);
		 while (start<=end)
		 {
			// int mid = (start +(end-start)/2);
			 
			 if(key==arr[mid])
			 {
				 return mid;
			 }
			 
			 if(isaccending)
			 {
				 if(key< arr[mid])
				 {
					 end=mid-1;
				 }
				 else
				 {
					 start=mid+1;
				 }
			 }
			 else
			 {
				 if(key>arr[mid])
				 {
					 end=mid-1;
					 
				 }
				 else
				 {
					 start=mid+1;
				 }
			 }
			 
			 mid=(start+(end-start)/2);
		 }
		 return -1;
		
	}
		
	
}