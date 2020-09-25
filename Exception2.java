//A Java interface can only contain method signatures and fields.The interface can be used to achieve polymorphism (takes an integer as input and return the sum of all its divisors)
package Day4;
import java.util.Scanner;
import Day4.AdvancedArithmetic;
import Day4.MyCalculator;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
 class MyCalculator implements AdvancedArithmetic {
    int j = 0;
   public int divisor_sum(int n) {
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j = j + i; 
            }
        }
        return j;
    }
  }

class Exception2{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
       sc.close();
    }
    
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
  }