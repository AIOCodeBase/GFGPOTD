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
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        int n = nums.length;
		int[] lis = new int[n];
		Arrays.fill(lis,1);
		for(int i = 1; i < n; i++)
			for(int j = 0; j < i; j++)
				if(nums[i] > nums[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		
		int[] lds = new int[n];
		Arrays.fill(lds,1);
		for(int i = n-2; i >= 0; i--)
			for(int j = n-1; j > i; j--)
				if(nums[i] > nums[j] && lds[i] < lds[j] + 1)
					lds[i] = lds[j] + 1;
		int ans = lis[0] + lds[0] - 1;
		for(int i = 1; i < n; i++)
			ans = Math.max(ans, lis[i] + lds[i] - 1);
		return ans;
    }
}