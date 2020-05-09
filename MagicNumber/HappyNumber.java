/*
Happy Number :- A number is called happy number if sum of square of its digits
led to 1 after a sequence of step in each step number is replaced by sum of
square of its digits.
Example :
19
1^2+9^2=82
8^2+2^2=68
6^2+8^2=100
1^2+0+0=1 (Happy number)
20
 2^2+0^2=4
 4^2=16
 1^2+6^2=37
 3^2+7^2=58
 5^2+8^2=89
 8^2+9^2=145
 1^2+4^2+5^2=42
 4^2+2^2=20
 2^2+0^2=4 (Not Happy Number)
 
*/
import java.util.*;
class MagicNumber{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
	
		int n=sc.nextInt();
		if(check(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	static int squareSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+((n%10)*(n%10));
			n=n/10;
		}
		return sum;
	}
	static boolean check(int n)
	{
		Set <Integer> set=new HashSet<Integer>();
		boolean res=true;
		while(res)
		{
		  n=squareSum(n);
		  if(n==1)
			  return true;
		  else if(set.contains(n))
			  return false;
		  set.add(n);
		}
		return true;
	}
}