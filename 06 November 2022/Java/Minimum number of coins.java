//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        int[] arr = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=arr.length-1; i>=0; --i){
            int num = arr[i];
            while(N>=num){
                ans.add(num);
                N -= num;
            }
        }
        return ans;
    }
}