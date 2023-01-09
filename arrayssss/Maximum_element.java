package arrays;
import java.util.*;
public class Maximum_element 
{
	public static int max_Element(int arr[])
	{
		int max=0;
		for(int i =0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of an arrays");
		int n =sc.nextInt();
		
		int []arr= new int[n];
		
		System.out.println("Enter the elements in an arrays");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(max_Element(arr));
	}

}
