import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public boolean isPrime(long n) {
        if(n==1) 
            return false;
        else if (n<4)
            return true; 
        else if (n%2==0)
            return false;
        else if (n<9)
            return true; 
        else if (n%3==0)
            return false;
        else {
            double r=Math.floor(Math.sqrt(n)); 
            double f=5;
            while(f<=r) {
                if (n%f==0)
                        return false;
                if (n %(f+2)==0) 
                    return false; 
                f=f+6;
            }
        }
        return true; 
    }
    
    public void quadratic(int ik) {
        int maxp = 0, af=0,bf=0;
        for (int a=-999;a<ik;a++) {
            for (int b=-999;b<ik;b++) {
                int n=0;
                while(true){
                    long qf = n*n+n*a+b;
                    if (isPrime(Math.abs(qf))) {
                        n+=1;
                    } else {
                        if (n>maxp) {
                            maxp = n;
                            af=a;
                            bf=b;
                        }
                        break;
                    }
                }
            }
        }
        long mqf = maxp*maxp+maxp*af+bf;
        System.out.println(af + " " +bf);
       
    }
    
    public static void main(String[] args) {
       
        Solution p = new Solution();
        Scanner s=new Scanner(System.in);
        int k = s.nextInt();
        p.quadratic(k);
    }
}
