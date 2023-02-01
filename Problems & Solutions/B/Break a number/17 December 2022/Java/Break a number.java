//{ Driver Code Starts

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.waysToBreakNumber(N));
        }
    }
}
// } Driver Code Ends

class Solution{
    int waysToBreakNumber(int N){
        int mod = 1000000007;
        long ans = (N+1)%mod;
        ans = ((ans%mod)*((N+2)%mod))%mod;
        ans/=2;
        ans%=mod;
        return (int)ans;
    }
}
