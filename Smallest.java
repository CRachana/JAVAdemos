//Smallest number
package oops;
import java.util.Scanner;
public class Smallest
{
	 public static void main(String[] args) 
	    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double n1 = input.nextDouble();
        System.out.print("Input the second number: ");
        double n2 = input.nextDouble();
        System.out.print("Input the third number: ");
        double n3 = input.nextDouble();

        System.out.println("The smallest value is " + smallestNum(n1, n2, n3));
     }
    public static double smallestNum(double t1, double t2, double t3){
        if (t1 <= t2 && t1 <= t3)
            return t1;
        else if (t2 <= t1 && t2 <= t3)
            return t2;
        else 
            return t3;
      }
}

