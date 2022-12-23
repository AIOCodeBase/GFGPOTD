//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends

class Solution {
  public static int maxCoins(int N, int[] b) {
        int n=b.length;
        int a[]=new int[n+2];
        n=a.length;
        a[0]=a[n-1]=1;
        for(int i=1;i<n-1;i++) a[i]=b[i-1];
        dp=new int[n][n];
        for(int e[]:dp) Arrays.fill(e,-1);
        return fun(a,0,n-1);
  }
  static int dp[][];
 static int fun(int a[],int l,int r)
  {
      if(r-l<=1) return 0;
      if(dp[l][r]!=-1) return dp[l][r];
      
      int ans=0;
      for(int m=l+1;m<r;m++)
      {
         int temp=a[l]*a[m]*a[r]+fun(a,l,m)+fun(a,m,r);
         ans=Math.max(ans,temp);
      }
     return dp[l][r]=ans;
  }   
}
     