//Get 2 integer and  print the exception if occurs after the operation.
package Day5;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
      try {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          try {
              int result = a / b;
              System.out.println(result);
          }
          catch (Exception e)
          {
              System.out.println("java.lang.ArithmeticException: / by zero");
          }
           }
      catch (Exception e)
      {
          System.out.println("java.util.InputMismatchException");
      }
  }
}