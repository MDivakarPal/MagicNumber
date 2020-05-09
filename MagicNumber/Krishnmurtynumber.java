/*
Krishnmurty number is a number whose sum of factorial of digit itself number.
Example 145
1!+4!+5!
1+24+120=145 (Krishnmurty number)
235
2!+3!+5!
2+6+120=128 (Not Krishnmurty number)
*/

import java.util.*;

class MagicNumber
{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check");
		int n=sc.nextInt(),t;
		t=n;
		long arr[]={0,1,2,6,24,120,720,5040,40320,362880};
		long sum=0;
		while(n!=0)
		{
			sum=sum+arr[n%10];
			n=n/10;
		}
		if(sum==t)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}