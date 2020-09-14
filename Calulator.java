// Arithmetic operation
package oops;
import java.util.Scanner;

public class Calulator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double result;
      char cal;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = input.nextDouble();
      num2 = input.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      cal = input.next().charAt(0);
      switch(cal) {
         case '+': result = num1 + num2;
            break;
         case '-': result = num1 - num2;
            break;
         case '*': result = num1 * num2;
            break;
         case '/': result = num1 / num2;
            break;
         case '%': result = num1 % num2;
            break;
      default: System.out.printf("Enter correct operator");
         return;
      }
      System.out.print("The result is :");
      System.out.printf(num1 + " " + cal + " " + num2 + " = " + result);
   }
}
