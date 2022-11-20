//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.lcmTriplets(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long lcmTriplets(long N) {
        // code here
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 2;
        }
        if(N%2 != 0){
            return N*(N-1)*(N-2);
        }
        
        if(N%3 == 0){
            return (N-1)* (N-2)*(N-3);
        }
        return Math.max(N*(N-1) * (N-3), (N-1)* (N-2)*(N-3));
    }
}