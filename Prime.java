//check the given no is prime or not
package oops;
import java.util.*;
public class Prime {
       public static void main(String[] args) 
       {
       System.out.print("Enter the number:");
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int p=0,m=0;
	   m=n/2;
	   if(n<=1)
		System.out.println(n+ " is not prime");
		else {
			for(int i=2;i<m;i++) 
			{
				if(n%i==0)
				{
				System.out.println(n +" is not prime");
				p++;
				break;
				}
			}
			if(p==0)
				System.out.println(n +" is prime");
		}
	}

}
