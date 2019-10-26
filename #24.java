import java.io.*;
import java.util.*;

public class Solution {

    public static ArrayList<String> lp = new ArrayList<String>();
    public static void permutation(String str) { 
        permutation("", str); 
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) lp.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public long Fact(long n){
        if (n==1) return n;
        return n*Fact(n-1);
        
    }
    
    public String GeneratePermutation(long n, String s) {
        ArrayList<Character> al = new ArrayList<Character>();
        for (char c : s.toCharArray())  al.add(c);
 
        long d=1;
        long ff= 0;
        String nlp = "";
        for (long i=s.length();i>=2;i--){
            long f = Fact(i-1);
            int nfd=(int)Math.ceil(n/(double)f);
            nlp+=al.get(nfd-1);
            al.remove(nfd-1);
            n=n-(nfd-1)*f;
        }
        nlp+=al.get(0);
        return nlp; 
    }
    
    public static void main(String[] args) {
        Solution p = new Solution();
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        String str ="abcdefghijklm";
        while(s.hasNext()) {
            int l = s.nextInt();
            System.out.println(p.GeneratePermutation(l,str));
        }
    }
}
