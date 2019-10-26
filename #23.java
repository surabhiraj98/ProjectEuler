import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public boolean[] perfect() {
        int sum =0, tot=0, value=100000;
        boolean[] ab = new boolean[value+1];
        Arrays.fill(ab, true);
        boolean[] sab = new boolean[value+1];
        Arrays.fill(ab, false);
        for (int j=1;j<=value;j++){
            sum =1;
            int s = (int)Math.sqrt(j);
            for (int i =2 ;i<=s;i++) {
                if(j%i==0) {
                    sum += i + j / i;
                }
            }
            if (s * s == j) sum -= s;
            if(sum>j) {
                ab[j]=true;
            }
        }

        for (int j=0;j<ab.length;j++){
            if (ab[j]) {
                for (int i=j;i<ab.length;i++){
                    if (ab[i]) {
                        int tot1 = i + j;
                        if (tot1<=value) {
                            sab[tot1]=true;
                        } else  {
                            break;
                        }
                    }
                }
            }
        }
    
        return sab;
    }
    
    public static void main(String[] args) {
        /
        Solution p = new Solution();
        boolean[] sab =p.perfect();
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int l;
        while(s.hasNext()) {
            l = s.nextInt();
          
            System.out.println(sab[l]?"YES":"NO");
        }        
    }
}
