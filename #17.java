import java.io.*;
import java.util.*;

public class Solution {
 private static String[] numName = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tensName = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numberOfTestCase = x.nextInt();
        for(int i=0;i<numberOfTestCase;i++)
            {
            long n = x.nextLong();
            String str = String.valueOf(n);
            int numberOfGroup = 0;
            if(str.length()%3==0)
                numberOfGroup = str.length()/3;
            else numberOfGroup = str.length()/3 + 1;
            int groupsForPrinting = numberOfGroup;
            int len = str.length();
            StringBuilder sb = null;
            Stack<String> finalStack = new Stack<String>();
            while(numberOfGroup!=0)
                {
                sb = new StringBuilder();
                if(len-3>=0)
                    sb.append(sr.charAt(len-3));
                if(len-2>=0)
                    sb.append(sr.charAt(len-2));
                if(len-1>=0)
                    sb.append(sr.charAt(len-1));
                finalStack.push(new String(sb));
                
                len-=3;
                numberOfGroup-=1;
            }
            while(!finalStack.isEmpty())
                {
                int val = Integer.valueOf(finalStack.pop());
                if(val!=0)
                    {
                    Stack<String> s = getWordsLessThanThousand(val);
                    if(s!=null) printStack(s);
                    if(groupsForPrinting==5)
                        System.out.print("Trillion ");
                    if(groupsForPrinting==4)
                        System.out.print("Billion ");
                    if(groupsForPrinting==3)
                        System.out.print("Million ");
                    if(groupsForPrinting==2)
                        System.out.print("Thousand ");
                }
                groupsForPrinting-=1;
            }
            System.out.println();
        }
    }
    public static Stack<String> getWordsLessThanThousand(long n)
        {
        Stack<String> s = null;
        if(n<numName.length)
            System.out.print(numName[(int)n] + " ");
        else if(n/10<10 && n%10==0)
            System.out.print(tensName[(int)n/10] + " ");
        else
            { 
            long num = n;
            int index = 1;
            s = new Stack<String>();
            boolean firstMod = false;
            while(num!=0)
                {
                if(num%100<numName.length && !firstMod)
                    {
                    int digit = (int)num%100;
                    if(index==100) 
                        {
                        s.push("Hundred");
                        s.push(numName[digit]);
                    }
                    else s.push(numName[digit]);
                    index*=100;
                    num/=100;
                }
                else
                    {   
                    firstMod = true;
                    int digit = (int)num%10;
                    if(index<10)
                        {
                        s.push(numName[digit]);
                    }
                    if(index==10) 
                        s.push(tensName[digit]); 
                    if(index==100) 
                        {
                        s.push("Hundred");
                        s.push(numName[digit]);
                    }
                    num/=10;
                    index*=10;
                }
            }
        }
        return s;
    }
    public static void printStack(Stack<String> s)
        {
        while(!s.isEmpty())
            {
            String sr = s.pop();
            if(!sr.equals(""))
                System.out.print(sr + " ");
        }
    }
}

