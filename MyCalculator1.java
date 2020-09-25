package Day5;
//import java.util.*;
import java.util.Scanner;

class MyCalculator{
    int power(int n, int p) throws Exception{
        if(n<0 || p<0)
            throw new Exception("n and p should be non-negative");
        return (int)Math.pow((double)n,(double)p);
    }
}

class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator M = new MyCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}