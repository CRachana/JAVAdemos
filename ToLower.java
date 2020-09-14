//Tolowercase
package oops;
import java.util.*;
public class ToLower {
   public static void main(String[] args)
   {
	System.out.print("Input a String: ");
    Scanner sc = new Scanner(System.in);
    String string =sc.nextLine();
    string = string.toLowerCase();
    System.out.println(string); 
   }			
}
