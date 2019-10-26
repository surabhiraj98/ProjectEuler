import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public void BinetLengthFibonacci (int ln) {
        int n =2;
        double q = Math.log10((1+Math.sqrt(5))/2);
        double f = 1-Math.log10(5)/2;
           while (true) {
            double l = n*q+f;
            if ((int)l==ln) break;
            n++;
        }
        System.out.println(n);
    }

    
    public void Fibonacci (int ik) {
        final String bignumber = BigInteger.valueOf(10).pow(ik).toString(10);
        
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = a.add(b);
        int count = 3;
        String chekc = c.toString(10);
        while (true) {
            a =b.add(c);
            chekc = a.toString(10);
            count++;
            if (chekc.length() >= bignumber.length()) break;

            b =c.add(a);
            chekc = b.toString(10);
            count++;
            if (chekc.length() >= bignumber.length()) break;

            c =a.add(b);
            count++;
            chekc = c.toString(10);
            if (chekc.length() >= bignumber.length()) break;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
       
        while(s.hasNext()) {
            l = s.nextInt();
           
            p.BinetLengthFibonacci(l);
        }
    }
}
