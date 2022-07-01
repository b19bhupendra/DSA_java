package arrayssss;
import java.util.*;
public class Array_Q9_repeat_and_missing_number_array 
{
    public static void main(String[] args) 
    {
        int arr[]={1, 3, 4, 5, 5, 6};
//        Arrays.sort(arr);
        int a=0,b=0;
        for (int i=0;i<arr.length;i++)
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
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                b=i+1;
                break;
            }
        }
        System.out.println(a+" , "+b);
    }
}
