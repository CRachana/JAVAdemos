//Identify the string with length greater than 6
package Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Welcome");
		names.add("to");
		names.add("HCL");
		names.add("Technologies");
		long count = names.stream().filter(str -> str.length() > 6).count();
		System.out.println("There are " + count + " strings with length greater than 6");

	}
}