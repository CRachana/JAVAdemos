// Ascii value of a given character
package oops;
import java.util.*;
public class AsciiValue {

	public static void main(String[] args) {
		System.out.print("Enter the character:");
		Scanner sc= new Scanner(System.in);
		char chr=sc.next(). charAt(0);
		int asciiValue= chr;
		System.out.println("The ASCII Value of " + chr +" is: "+asciiValue);
	}

}
