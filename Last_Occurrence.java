//find the last occurrence index of x element
package arrays;
import java.util.*;
public class Last_Occurrence 
{
	
	public static int last(int arr[],int x)
	{
		int ans=-1;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				ans=i;
			}
		}
		return ans;
	}
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the arrays");
		
		int n = sc.nextInt();
		
		int [] arr= new int [n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the element that to b find");
		int x= sc.nextInt();
		
		
		System.out.println(last(arr,x));
	}

}
