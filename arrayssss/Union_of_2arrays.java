/* - Given two arrays a[] and b[] of size n and m respectively where m >= n. 
   The task is to find union between these two arrays and print the number of elements of the union set.
   Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
   If there are repetitions, then only one occurrence of element should be printed in the union. 
Input:5 3
	1 2 3 4 5
	1 2 3
	Output:5
Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays. So count is 5.
*/

package arrays;
import java.util.*;
public class Union_of_2arrays 
{
	
	public static void union(int arr1[],int arr2[],int n ,int m)
	{
		
		int [] temp=new int [n+m];
		int t=0;
		int count=0; 
		for(int i =0;i<arr1.length;i++)
		{
			temp[t]=arr1[i];
			t++;
		}
		
		for(int i =0;i<arr2.length;i++)
		{
			temp[t]=arr2[i];
			t++;
		}
		Arrays.sort(temp);
		for(int i=1;i<temp.length;i++)
		{
			if(temp[i]==temp[i-1])
			{
				count++;
			}
		}
		System.out.println(temp.length-count);
	}
	
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of an arrays ");
		int n =sc.nextInt();
		int m =sc.nextInt();
		int []arr1=new int [n];
		int []arr2=new int [m];
		
		
		System.out.println("Enter the values in first arrays of size n");
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the values of second arrays of size m");
		for(int i =0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		union(arr1,arr2,n,m);
	}
}
