import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numberOfTestCases = in.nextInt();
        HashMap<Long, Integer> seenPrimes = new LinkedHashMap<Long, Integer>();
        int primesFound = 2;
        int j=3;
        
        for(long i=0L;i<numberOfTestCases;i++)
            {
            Long n = in.nextLong();
            if((long)n == 1L)
                {
                System.out.println("2");
            }
            if(seenPrime.containsKey(n))
                {
                System.out.println(seenPrime.get(n));
            }
            else
                {
                for(;primeF<=n;j+=2)
                    {
                    if(isPrime(j))
                        {
                        if((long)primeF == n)
                            {
                            System.out.println(j);
                            break;
                        }
                        if(!seenPrime.containsKey(primeF))
                            {
                            seenPrime.put((long)primeF, j);
                        }
                        primeF+=1;
                    }
                }   
            }    
        }
        }
    
    public static boolean isPrime(long num)
        {
        try
            {
            if ( num > 2 && num%2 == 0 ) return false;
            int top = (int)Math.sqrt(num) + 1;
            for(int i = 3; i < top; i+=2)
                {
                if(num % i == 0)
                    {
                return false;
                }
            }
            return true;  
        }
        catch(Exception e)
            {
            throw e;
        }
    }
}
