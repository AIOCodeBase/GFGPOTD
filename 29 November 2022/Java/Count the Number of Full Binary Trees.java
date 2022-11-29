//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.numoffbt(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static int numoffbt(int arr[], int n)
    {
        int maxvalue=Integer.MIN_VALUE;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxvalue=Math.max(maxvalue,arr[i]);
            minvalue=Math.min(minvalue,arr[i]);
        }
        int mark[]=new int[maxvalue+2];
        int value[]=new int[maxvalue+2];
        for(int i=0;i<n;i++){
            mark[arr[i]]=1;
            value[arr[i]]=1;
        }
        int ans=0;
        int mod=1000000007;
        for(int i=minvalue;i<=maxvalue;i++){
            if(mark[i]!=0){
                for(int j=i+i;j<=maxvalue && j/i<=i;j+=i){
                    if(mark[j]!=0){
                        value[j]=(value[j]+(value[i]*value[j/i])%mod)%mod;
                        if(i!=j/i){
                            value[j]=(value[j]+(value[i]*value[j/i])%mod)%mod;
                        }
                    }
                }
            }
        }
        for(int i:value){
            ans=(ans+i)%mod;
        }
        return ans;
    }
}