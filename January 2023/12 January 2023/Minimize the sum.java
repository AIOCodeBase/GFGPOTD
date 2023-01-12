//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i<N; i++){
            pq.offer(arr[i]);
        }
        
        int res = 0;
        
        while(pq.size() >= 2){
            int p1 = pq.poll();
            int p2 = pq.poll();
            
            int val = p1+p2;
            res += val;
            pq.offer(val);
           
        }
        
        return (long)res;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends
