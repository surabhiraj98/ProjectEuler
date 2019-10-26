import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int a = s.nextInt();
        int b = s.nextInt();
        int increment = 4;

        for(long i=1;i<n;i++)
            {
            if(a==3)
                {
                if(isTriangularNumber(i))
                    System.out.println(i);
                if(i==1) i+=3;
                else if(i>4)
                    {
                    i+=increment+2;
                    increment+=3;
                }
            }
            else
                {
                if(isHexagonalNumber(i))
                    System.out.println(i);
                if(i==1) i+=3;
                else if(i>4)
                    {
                    i+=increment+2;
                    increment+=3;
                }
            }
        }
    }
    public static boolean isTriangularNumber(long n)
        {
        double tTest = Math.sqrt(1 + 8*n);
        return tTest == ((long)tTest);
    }
    private static boolean isHexagonalNumber(long number) 
        {
        double hexTest = (Math.sqrt(1 + 8*number) + 1.0) / 4.0;
        return hexTest == ((long)hexTest);
    }
}
