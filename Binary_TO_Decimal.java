package basic;
import java.util.*;
public class Binary_TO_Decimal
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the binary number");
		
		int binary_number = sc.nextInt();
		
		System.out.println("Enter the decimal number");
		int decimal_number=sc.nextInt();
		
		System.out.println("\nBinary to Decimal");
		binaryToDecimal(binary_number);
		System.out.println("\nDecimal to Binary ");
		decimalToBinary(decimal_number);
		
	}
	public static void binaryToDecimal(int binary_number)
	{
		int ans=0;
		int power=1;
		
		while(binary_number>0)
		{
			int unit_digit=binary_number%10;
			ans= ans+(unit_digit*power);
			binary_number=binary_number/10;
			
			power=power*2;
		}
		System.out.println(ans);		
	}
	
	public static void decimalToBinary(int decimal_number)
	{
		int ans =0;
		int pw=1; //power of ten
		while(decimal_number>0)
		{
			int parity=decimal_number%2;
			ans=ans+(pw*parity);
			pw=pw*10;
			
			decimal_number=decimal_number/2;
		}
		System.out.println(ans);
	}
}
