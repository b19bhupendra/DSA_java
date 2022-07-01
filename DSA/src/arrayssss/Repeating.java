package arrayssss;
import java.util.*;
import java.math.*;
public class Repeating 
{
	public static void repeating(int []arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[Math.abs(arr[i])]<0)
			{
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}
			else
			{
				System.out.println(Math.abs(arr[i]));
			}
		}
	}

	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size ");
		int n =sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements in the arrays ");
		for (int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		repeating(arr);
	}

}
