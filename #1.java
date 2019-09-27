import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static BigInteger sumMupltiple(int num, int limit) {
        BigInteger sum = BigInteger.ZERO;
        limit = limit - 1;
        BigInteger numMultiples = new BigInteger(""+limit).divide(new BigInteger(""+num));
        return sum.add(
            numMultiples.multiply(numMultiples.add(new BigInteger(""+1))).divide(new BigInteger(""+2)).
            multiply(new BigInteger(""+num)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            System.out.println(
                sumMupltiple(3, N).
                add(sumMupltiple(5, N)).
                subtract(sumMupltiple(15, N)));   
        }
    }
}
