package arrayssss;
import java.util.*;
public class Reverse
{
	
	static void reverse(int[]arr)
	{
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an arrays");
		int n =sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements in the arrays");
		for(int i = 0;i<=arr.length-1;i++ )
		{
			arr[i]=sc.nextInt();
		}
		reverse(arr);
	}

}
