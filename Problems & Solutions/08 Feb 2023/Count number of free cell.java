//{Driver code starts
//Initial Template for java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine().trim());
        while(T>0)
        {
            String s[]=in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[][] a = new int[k][2];
            for(int i=0; i<k; i++){
                s=in.readLine().trim().split(" ");
                a[i][0] = Integer.parseInt(s[0]);
                a[i][1] = Integer.parseInt(s[1]);
            }
            Solution g = new Solution();
            long[] res = g.countZero(n,k,a);
            
            for(int i=0; i<res.length; i++){
                out.print(res[i]+" ");
            }
            out.println();
            T--;
        }
        out.close();
    }
}


// } Driver Code Ends

//User function Template for Java


class Solution {
    long[] countZero(int n, int k, int[][] arr){
        // code here
        int row [] = new int[n+1];
        int col [] = new int[n+1];
        long ans [] = new long[k];
        long oneR = 0;
        long oneC = 0;
        for(int i=0;i<k;i++){
            int r = arr[i][0];
            if(row[r]==0){
                row[r]++;
                oneR++;
            }
            int c = arr[i][1];
            if(col[c]==0){
                col[c]++;
                oneC++;
            }
            ans[i] = (long)n*(long)n -(long)n*(oneR+oneC)+(oneR*oneC);
        }
        return ans;
    }
}
