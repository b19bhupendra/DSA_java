package arrayssss;
import java.util.*;
public class Trapping_Rain_water
{
	    public static int trap(int[] height)
	    {
	         int n= height.length;
	        int left []=new int [n];
	        int ryt[]= new int [n];
	        
	        left[0]=height[0];
	        for(int i =0;i<n;i++)
	        {
	            left[i]=Math.max(left[i-1],height[i]);
	        }
	        
	        ryt[n-1]=height[n-1];
	        for(int i=n-2;i>=0;i--)
	        {
	            ryt[i]=Math.max(ryt[i+1],height[i]);
	        }
	        int ans=0;
	        for(int i=0;i<n;i++)
	        {
	            ans = ans+(Math.min(left[i],ryt[i])-height[i]);
	        }
	        return ans;
	        
	        
	    }
	    public static void main (String[] args )
	    {
	    	Scanner sc=new Scanner (System.in);
			System.out.println("Enter the size ");
			int n =sc.nextInt();
			int height[]= new int[n];
			System.out.println("Enter the elements in the arrays ");
			for (int i =0;i<height.length;i++)
			{
				height[i]= sc.nextInt();
				
			}
	    	trap(height);
	}

}

