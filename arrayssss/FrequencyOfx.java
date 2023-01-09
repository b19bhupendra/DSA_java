//count the number of occurrences of a particular element x

package arrays;
import java.util.*;
public class FrequencyOfx
{
	public static int frequency(int arr[],int x)
	{
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number whos frequency is to be found");
		int x=sc.nextInt();
		
		System.out.println((frequency(arr,x)));
	}

}
