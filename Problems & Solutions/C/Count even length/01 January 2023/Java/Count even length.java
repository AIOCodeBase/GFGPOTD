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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.compute_value(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution
{
    static long mod=1000000007;
    public int  compute_value(int n)
    {
        if(n==1)
		return 2;
		long val=2;
		for(long i=1;i<n;i+=1)
		{
		   val=(val%mod*((2*i)%mod+1)%mod*2)%mod;
		   long x=modpwr(i+1,mod-2);
		   val=(val*x)%mod;
		}
		return (int)val;
    }
	public static long modpwr(long m,long n)
	{
		long res=1;
		m=m%mod;
		if(m==0)
		return 0;
		while(n>0)
		{
			if((n&1)!=0)
			{
				res=(res*m)%mod;
			}
			n=n>>1;
			m=(m*m)%mod;
		}
		return res;
	}
}