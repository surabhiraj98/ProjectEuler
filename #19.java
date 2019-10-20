import java.io.*;
import java.util.*;

public class Solution {

    private static String[] day = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private static String[] month = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numberOfTestCase = s.nextInt();
        for(int i=0;i<numberOfTestCase;i++)
            {
            long y = s.nextLong();
            int m = s.nextInt();
            int d = s.nextInt();        
            long y1 = s.nextLong();
            int m1 = s.nextInt();
            int d1 = s.nextInt();
            long sundayCount = 0 ;
            int dow = getDayOfWeek(y, m, d);
            
            while(y<y1)
                {
                while(m<=12)
                    {
                    int numberOfDaysInMonth = getDaysInMonth(y, m);
                    while(d<=numberOfDaysInMonth)
                        {
                        if(day[dow].equals("Sunday") && d==1)
                            {
                           
                            sundayCount+=1;
                        }
                        if(dow == 6) dow = 0;
                        else dow+=1;
                        d+=1;
                    }
                    d=1;
                    m+=1;
                }
                m=1;
                y+=1;
            }
            if(y==y1)
                {
                while(m<m1)
                    {
                    int numberOfDaysInMonth = getDaysInMonth(y, m);
                    while(d1<=numberOfDaysInMonth)
                        {
                        if(day[dow].equals("Sunday") && d==1)
                            {
                            
                            sundayCount+=1;
                        }
                        if(dow == 6) dow = 0;
                        else dow+=1;
                        d+=1;
                    }
                    d=1;
                    m+=1;
                }
                if(m==m1)
                    {
                    while(d<=d1)
                        {
                        if(day[dow].equals("Sunday") && d==1)
                            {
                       
                            sundayCount+=1;
                        }
                        if(dow == 6) dow = 0;
                        else dow+=1;
                        d+=1;
                    }
                }
            }
            System.out.println(sundayCount);
        }
    }
    public static int getDaysInMonth(long y, int m)
        {
        int numberOfDaysInMonth = 0;
        if(month[m].equals("September") || month[m].equals("April") || month[m].equals("June") || month[m].equals("November"))
            numberOfDaysInMonth = 30;
        else if(month[m].equals("February"))
        {
            if(isLeapYear(y)) numberOfDaysInMonth = 29;
            else numberOfDaysInMonth = 28;
        }
        else numberOfDaysInMonth = 31;
        
        return numberOfDaysInMonth;
    }
    public static int getDayOfWeek(long year, int month, int day)
        {
        if(month == 1)
            {
            month = 13;
            year-=1;
        }
        if(month == 2)
            {
            month = 14;
            year-=1;
        } 
        long j = year/100;
        long k = year%100;
        long dow = (day + (26*(month+1))/10 + k + k/4 + j/4 + 5*j ) % 7;
        if(dow<0) dow+=7;
        
        return (int)dow;
    }
    public static boolean isLeapYear(long year)
        {
        if(year%4!=0) return false;
        else
            {
            if(year%100!=0) return true;
            else
                {
                if(year%400==0) return true;
                else return false;
            }
        }
    }
}
