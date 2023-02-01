//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int mod=1000000007;
    public int CountWays(String str)
    {
        long dp1 = 1, dp2 = 0;
        int n = str.length();
        for(int i=n-1; i>=0; i--) {
            
            long dp = str.charAt(i) == '0' ? 0 : dp1;
            
            if(i<n-1 && (str.charAt(i) == '1' || str.charAt(i) == '2' && str.charAt(i+1) < '7'))
                dp = (dp+dp2) % mod;
            dp2 = dp1;
            dp1 = dp;
        }
        
        return (int)(dp1 % mod);
    }
}
