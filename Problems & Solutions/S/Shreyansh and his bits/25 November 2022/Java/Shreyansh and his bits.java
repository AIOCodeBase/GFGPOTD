//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

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
            String input_line[] = read.readLine().trim().split("\\s+");
            long  N = Long.parseLong(input_line[0]);
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    long cache[][];
    long count(long n)
    {
        cache=new long[40][40];
        for(int i=0;i<40;i++){
            Arrays.fill(cache[i],-1);
        }
        int one=0;
        long ans=0;
        int bits=0;
        while(n>0){
            if((n&1L)!=0){
                one++;
                ans+=nCr(bits,one);
            }
            n>>=1;
            bits++;
        }
        return ans;
    }
    long nCr(int n,int r)
    {
        if(r>n)return 0;
        if(r==0 || r==n)return 1;
        if(cache[n][r]!=-1){
            return cache[n][r];
        }
        return cache[n][r]=nCr(n-1,r-1)+nCr(n-1,r);
    }
}