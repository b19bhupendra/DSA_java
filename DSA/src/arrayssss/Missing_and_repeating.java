package arrayssss;
import java.util.*;

public class Missing_and_repeating 
{
	public static void repeating(int []arr)
	{
		int a=0;int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[Math.abs(arr[i])-1]<0)
            {
                a=Math.abs(arr[i]);
            }
            else
            {
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
            }
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				b=i+1;
			}
		}
		
		System.out.println(a+","+b);
	
		
	}
	

	public static void main(String []args)
	{
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the arrays");
		int n = sc.nextInt();
		int []arr=new int [n];
		System.out.println("enter the elements in the arrays ");
		for(int i= 0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		 repeating(arr);
		 
	}
}

