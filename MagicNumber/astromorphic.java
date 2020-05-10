/*
Astromorphic Number :-
A number is astromorphic number if square of number contains numbesr at last singificant digit.
Example :
5 = 5^2 =25 (Astromorphic number)
76-> 76^2 =5776 (Astromorphic number)
 7-> 7^2 = 49 (Not Astromorphic number)

*/

import java.util.*;
class Test {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    if(isAstromorphic(sc.nextInt()))
    System.out.println("Yes");
    else
    System.out.println("No");
    sc.close();
}

static boolean isAstromorphic(int n)
{
    int res=n*n;
    while(n>0)
    {
        if(res%10==n%10)
        {
            res=res/10;
            n=n/10;
        }
        else
        return false;
    }
    return true;
}
}