package arrayssss;
import java .util.*;

public class Chocolate_Distribution 
{
	
	public int solution(int [] arr,int m)
	{
		int min_diff=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i+m-1<arr.length;i++)
		{
			int diff=arr[i+m-1]-arr[i];
			if(diff<min_diff)
			{
				min_diff=diff;
			}
			
		}
		return min_diff;
		
			
	}
	public static void main(int args[])
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an arrays");
		int n =sc.nextInt();
		int m = sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements in the arrays");
		for(int i = 0;i<=arr.length-1;i++ )
		{
			arr[i]=sc.nextInt();
		}
		
		Chocolate_Distribution s1=new Chocolate_Distribution();
		
		int res=s1.solution(arr,m);
		System.out.println(res);
	
		
		
	}
	}



