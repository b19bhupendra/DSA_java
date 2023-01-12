/*Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5 */

package arrays;
import java.util.*;
public class Move_negative2 
{
	
	public static void negative(int arr[],int n )
	{
		int temp[]= new int [n];
		int k=0;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				temp[k]=arr[i];
				k++;
			}
		}
		
		for(int i =0;i<arr.length;i++)
		{
			
			if(arr[i]<0)
			{
				temp[k]=arr[i];
				k++;
			}
		}
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
			
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the arrays");
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		
		System.out.println("Enter the elements in the arrays");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		negative(arr,n);
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
