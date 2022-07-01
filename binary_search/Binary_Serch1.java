package binary_search;
import java.util.*;
public class Binary_Serch1
{
	public static int binary(int arr[],int key)
	{
		int start=0;
	
		int end=arr.length-1;
		
		int mid=(start+(end-start)/2);
		
		
		 while (start<=end)
		 {
			 if(arr[mid]==key)
			 {
				 return mid;
			 }
			 if(key>arr[mid])
			 {
				 start=mid+1;
			 }
			 else//(key<arr[mid])
			 {
				 end=mid-1;
			 }
			 
			 mid=(start+(end-start)/2);
		 }
		 return -1;
	 
	}
	
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an arrays");
		int n =sc.nextInt();
		int []arr=new int [n];
		System.out.println("enter the elements in the arrys ");
		int key=23;
		for(int i= 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		binary(arr,key);
		int res = binary(arr,key);
		System.out.println(res);
		
		
	}

}
