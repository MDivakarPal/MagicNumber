/*
Palindrome Number :
A number said to be a palindrome number if reverse of number is it self number.
Example 
121
*/

import java.util.Scanner;
class MagicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any no to check it is palindrome or not");
        int n=sc.nextInt();
        if(isPalindrome(n))
          System.out.println("It is a palndrome number");
          else
          System.out.println("It is not a palindrome number");
    }
    static boolean isPalindrome(int n)
    {
       boolean res=false;
       int rev=0,num=n;
       while(n>0)
       {
           rev=rev*10+n%10;
           n=n/10;
       }
       if(rev==num)
         res=true;
       return res;
    }
}