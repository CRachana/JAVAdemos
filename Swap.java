//swap the given two number
package oops;
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
   int x, y, z;
   Scanner sc = new Scanner(System.in);

   System.out.println("Input the first number: ");
   x = sc.nextInt();
   System.out.println("Input the second number: ");
   y = sc.nextInt();

   z = x;
   x = y;
   y = z;

   System.out.println(" Swapped values are3:" + x + " and " + y);
  }
}