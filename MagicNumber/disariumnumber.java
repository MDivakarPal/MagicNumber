/*
Disarium number :
Disarium number is a number whose sum of digit of power of respective position is 
it selft number.
Example : -
135
1^1+3^2+5^3=135 (Disarium number)
*/

import java.util.*;
class MagicNumber{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		if(check(sc.nextInt()))
		   System.out.println("YES");
	    else
		   System.out.println("NO");	 
	}
	static int countDigit(int n)
	{
		int res=0;
		while(n!=0)
		{
			res++;
			n=n/10;
		}
		return res;
	}
	
	static boolean check(int n)
	{
		int digits=countDigit(n);
		int sum=n;
		while(n!=0)
		{
			sum=sum-(int)Math.pow(n%10,digits--);
			n=n/10;
		}
		if(sum >0 || sum <0)
			return false;
		else
			return true;
	}
}