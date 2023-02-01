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
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        int start=0,max=0,ans=0;
        int []arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']+=1;
            max=Math.max(max,arr[s.charAt(i)-'A']);
            if(Math.abs(max-(i-start+1))>k){
                arr[s.charAt(start)-'A']-=1;
                max=0;
                start++;
                for(int ele:arr) max=Math.max(ele,max);
            }
            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }
}