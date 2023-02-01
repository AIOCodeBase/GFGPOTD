//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int mat[][] = new int[n][m];
            for(int i = 0;i < n;i++){
                String a[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < m;j++)
                    mat[i][j] = Integer.parseInt(a[j]);
            }
            String a1[] = in.readLine().trim().split("\\s+");
            int ty = Integer.parseInt(a1[0]);
            int i = Integer.parseInt(a1[1]);
            int j = Integer.parseInt(a1[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.hopscotch(n, m, mat, ty, i, j));
        }
    }
}
// } Driver Code Ends

class Solution{
    static boolean valid(int i, int j, int n, int m) {
        if(i >= 0 && j >= 0 && i < n && j < m)
            return true;
        return false;
    }
    static int hopscotch(int n, int m, int mat[][], int ty, int i, int j) 
    {
        // code here
        int sum = 0;
        if(ty == 0) {
            if(j%2 == 0) {
                if(valid(i-1, j-1, n, m)) sum += mat[i-1][j-1];
                if(valid(i-1, j, n, m)) sum += mat[i-1][j];
                if(valid(i-1, j+1, n, m)) sum += mat[i-1][j+1];
                if(valid(i, j-1, n, m)) sum += mat[i][j-1];
                if(valid(i, j+1, n, m)) sum += mat[i][j+1];
                if(valid(i+1, j, n, m)) sum += mat[i+1][j];
            }
            else{
                if(valid(i-1, j, n, m)) sum += mat[i-1][j];
                if(valid(i, j-1, n, m)) sum += mat[i][j-1];
                if(valid(i, j+1, n, m)) sum += mat[i][j+1];
                if(valid(i+1, j-1, n, m)) sum += mat[i+1][j-1];
                if(valid(i+1, j, n, m)) sum += mat[i+1][j];
                if(valid(i+1, j+1, n, m)) sum += mat[i+1][j+1];
            }
        }
        else{
            if(j%2 == 0) {
                if(valid(i-2, j-1, n, m)) sum += mat[i-2][j-1]; 
                if(valid(i-2, j, n, m)) sum += mat[i-2][j];
                if(valid(i-2, j+1, n, m)) sum += mat[i-2][j+1]; 
                if(valid(i-1, j-2, n, m)) sum += mat[i-1][j-2];
                if(valid(i-1, j+2, n, m)) sum += mat[i-1][j+2]; 
                if(valid(i, j-2, n, m)) sum += mat[i][j-2];
                if(valid(i, j+2, n, m)) sum += mat[i][j+2]; 
                if(valid(i+1, j-2, n, m)) sum += mat[i+1][j-2];
                if(valid(i+1, j-1, n, m)) sum += mat[i+1][j-1]; 
                if(valid(i+1, j+1, n, m)) sum += mat[i+1][j+1];
                if(valid(i+1, j+2, n, m)) sum += mat[i+1][j+2]; 
                if(valid(i+2, j, n, m)) sum += mat[i+2][j];
            }
            else{
                if(valid(i-1, j-2, n, m)) sum += mat[i-1][j-2]; 
                if(valid(i-1, j-1, n, m)) sum += mat[i-1][j-1];
                if(valid(i-2, j, n, m)) sum += mat[i-2][j]; 
                if(valid(i-1, j+1, n, m)) sum += mat[i-1][j+1];
                if(valid(i-1, j+2, n, m)) sum += mat[i-1][j+2]; 
                if(valid(i, j-2, n, m)) sum += mat[i][j-2];
                if(valid(i, j+2, n, m)) sum += mat[i][j+2]; 
                if(valid(i+1, j-2, n, m)) sum += mat[i+1][j-2];
                if(valid(i+1, j+2, n, m)) sum += mat[i+1][j+2]; 
                if(valid(i+2, j-1, n, m)) sum += mat[i+2][j-1];
                if(valid(i+2, j, n, m)) sum += mat[i+2][j]; 
                if(valid(i+2, j+1 ,n, m)) sum += mat[i+2][j+1];
            }
        }
        return sum;
    }
}