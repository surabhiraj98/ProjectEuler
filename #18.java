import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int numberOfTestCase = s.nextInt();
        for(int i=0;i<numberOfTestCase;i++)
            {
            int numberOfRowsInTriangle = s.nextInt();
            s.nextLine();
            ArrayList<String> list = new ArrayList<String>();
            for(int j=0;j<numberOfRowsInTriangle;j++)
                list.add(s.nextLine());
            
            int[][] triangleArray = TriangleArray(list, list.size());
            for(int j=triangleArray.length-2;j>=0;j--)
                {
                for(int k=0;k<triangleArray[j].length && k+1<triangleArray[j].length;k++)
                    {
                    
                    triangleArray[j][k] += Math.max(triangleArray[j + 1][k], triangleArray[j + 1][k + 1]); 
                }
            }
           
            System.out.println(triangleArray[0][0]);
        }
    }
    public static int[][] TriangleArray(ArrayList<String> list, int size)
        {
        int[][] triangleArray = new int[size][size];
        for(int i=0;i<list.size();i++)
            {
            String currentList = list.get(i);
            String[] currentRow = currentList.split(" ");
            for(int j=0;j<currentRow.length;j++)
                {
                triangleArray[i][j] = Integer.valueOf(currentRow[j]);
            }
        }
        return triangleArray;
    }
    public static void printArray(int[][] triangleArray, int size)
        {
        for(int i=0;i<size;i++)
            {
            for(int j=0;j<size;j++)
                {
                System.out.print(triangleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printList(ArrayList<String> list)
        {
        for(int i=0;i<list.size();i++)
            {
            System.out.println(list.get(i));
        }
    }
}
