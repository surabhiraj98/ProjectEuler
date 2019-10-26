import java.io.*;
import java.util.*;

public class Soltuion {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();
        SortedSet<Long> res = new TreeSet<Long>();

        for(long i=k+1;i<=n;i++)
            {
            long pn = (long)(i*((3*i)-1)/2);
            long j = i-k;
            long pNMinusK = (long)(j*((3*j)-1)/2);
            if(isPentagonal(pn-pNMinusK) || isPentagonal(pn+pNMinusK))
                res.add(pn);
        }
        Iterator it = res.iterator();
        while (it.hasNext())
            System.out.println(String.valueOf(it.next()));
    }
    private static boolean isPentagonal(long number) 
    {
        double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
        return penTest == ((long)penTest);
    }
}
