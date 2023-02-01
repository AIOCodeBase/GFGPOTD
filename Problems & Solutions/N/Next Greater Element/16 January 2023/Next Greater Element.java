//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        Stack<Long> st = new Stack<>();
        
        long[] ans = new long[n];
        
        for(int i=n-1;i>=0;i--){
            
            if(st.isEmpty())    ans[i] = -1;
            
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            
            if(i<n && !st.isEmpty()) ans[i] = st.peek();
            
            else ans[i] = -1;
            
            st.push(arr[i]);
        }
        return ans;
    } 
}
