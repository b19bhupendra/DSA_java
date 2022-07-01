//maximum product of subarrays 
//this is optimized and can run on all test cases
package arrayssss;
import java.util.*;
public class Product_subarrays1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of the arrays");
		int n =sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the elements in the arryas ");
		for (int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans= max_product(arr,n);
		System.out.println(ans);
	}
	public static int max_product(int arr[],int n)
	{
		int max_product=Integer.MIN_VALUE;
		int current_product=1;
		
		for(int i=0; i<arr.length;i++)
		{
			current_product=current_product*arr[i];
			
			if(current_product>max_product)
			{
				max_product=current_product;
			}
			if(current_product==0)
			{
				current_product=1;
			}
		}
		
		
		 current_product=1;
		for(int i=arr.length-1; i>=0;i--)
		{
			current_product=current_product*arr[i];
			
			if(current_product>max_product)
			{
				max_product=current_product;
			}
			if(current_product==0)
			{
				current_product=1;
			}
		}
		
		
		return max_product;
		
		
		
	}

}
