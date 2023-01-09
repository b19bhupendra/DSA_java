// Search the given element in the array. if Present then return the index of that 
// element else return -1
//if the element occurs multiple time the return the first occurence

package arrays;
import java.util.*;
public class Search_Element
{
	public static int xElement(int arr[],int x)
	{
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of the arrays");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("enter the elemnts in the arrays ");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the element that to be searched in  the arays");
		int x= sc.nextInt();
		
		int result = xElement(arr,x);
		System.out.println(result);
	}

}
