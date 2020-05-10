import java.util.Scanner;

class  Test {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number");
    if(isPerfectSquare(sc.nextInt()))
    System.out.println("Yes");
    else
    System.out.println("No");
}   
   static boolean isPerfectSquare(int n)
   {
       System.out.println(Math.sqrt(n));
       for(int i= 1;i*i<=n;i++)
       {
           if(i>Math.sqrt(n))
           break;
           if(n%i==0 && (n)/(i)==i)
           return true;
       }
       return false;
   } 
}