package arrayssss;
import java.util.*;
public class Product_subarrays 
{
	public static void main(String[]args)
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
		
		int ans=product(arr,n);
		System.out.println(ans);
		
		
	}
	
	public static int product(int arr[],int n)
	{
		int current_product=1;
		int max_product=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			current_product=current_product*arr[i];
			 
			if(current_product>max_product) 
			{
				max_product=current_product;
			}
			
			if(current_product<0)
			{
				current_product=1;
			}
		}
		return max_product;
	}

}
