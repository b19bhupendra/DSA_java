//count the number of element greater then vlaue x
package arrays;
import java.util.*;
public class Count_GreaterThenx 
{
	
	public static int count(int arr[],int x)
	{
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>x)
			{
				count++;
			}
		}
		return count;
	}
	

//check if the given element is sorted or not
	public static boolean issorted(int arr[])
	{
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				System.out.println("Not Sorted Array");
				return false;
				
			}
		}
		return true;
	}
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int n =sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements in the arrays");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element x");
		int x=sc.nextInt();
		
		System.out.println(count(arr,x));
		
		System.out.println(issorted(arr));
	}

}
