package arrayssss;
import java.util.*;
public class Kadans_Algo 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of the number ");
		int n = sc.nextInt();
		int []arr=new int [n];
		System.out.println("Enter the elements in the arrays ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int ans=max_subarrays(arr,n);
		System.out.println(ans);
		
	}
	public static int max_subarrays(int arr[],int n)
	{
		int current_sum=0;
		int max_sum=Integer.MIN_VALUE;//int max_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			current_sum=current_sum+arr[i];
			
			if(current_sum>max_sum)
			{
				max_sum=current_sum;
			}
			if(current_sum<0)
			{
				current_sum=0;
			}
		}
		return max_sum;
	}
	

}
