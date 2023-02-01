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
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        // code here
        int count=0;
        int dp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=0;
            for(int j=0;j<i;j++)
               if(nums[i]>nums[j]) dp[i]++;
        }
        for(int i=2;i<nums.length;i++)
           for(int j=0;j<i;j++)
               if(nums[i]>nums[j]) count+=dp[j];
        return count;
    }
}