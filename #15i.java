import java.io.*;
import java.util.*;
import java.math.*;

public class LatticePaths {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfTestCase = s.nextInt();
        
        for(int i=0;i<numberOfTestCase;i++)
            {
            int n = s.nextInt();
            int m = s.nextInt();  
            BigInteger nPlusMFact = getFactorial(n+m);
            BigInteger nFact = getFactorial(n);
            BigInteger mFact = getFactorial(m);
            BigInteger nFactIntoMFact = nFact.multiply(mFact);
            BigInteger res = nPlusMFact.divide(nFactIntoMFact);
            BigInteger modVal = BigInteger.valueOf(1000000007);
            System.out.println(res.mod(modVal));
        }
    }
    public static BigInteger getFactorial(int n)
        {
        if(n==1) return BigInteger.valueOf(1);
        BigInteger fact = BigInteger.valueOf(1);
        for(int i=2;i<=n;i++)
            {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
