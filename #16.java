import java.io.*;
import java.util.*;
import java.math.*;

public class PowerDigitSum {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        int numberOfTestCase = s.nextInt();
         for(int i=0;i<numberOfTestCase;i++)
            {
             BigInteger b1 = null;
             int n = s.nextInt();
             if(n%2==0)
                 {
                  b1 = compute2ToTheN(n);
             }
             else 
                 {
                 b1 = compute2ToTheN(n-1);
                 b1 = b1.multiply(BigInteger.valueOf(2));
             }
             System.out.println(getDigitSum(b1));
         }
    }
    public static long getDigitSum(BigInteger b1)
        {
        int digit = 0;
        long sum = 0;
        while(b1.compareTo(BigInteger.valueOf(0))==1)
            {
            digit = b1.mod(BigInteger.valueOf(10)).intValue();
            sum+=digit;
            b1 = 1.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    public static BigInteger compute2ToTheN(int n)
        {
        if(n==1) return BigInteger.valueOf(2);
        BigInteger pow = compute2ToTheN(n/2);
        if(n%2==0) return pow.multiply(pow);
        else return BigInteger.valueOf(2).multiply(pow.multiply(pow));
    }
}
