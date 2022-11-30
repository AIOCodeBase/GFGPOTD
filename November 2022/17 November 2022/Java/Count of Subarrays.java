//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            long ans = new Solution().countSubarray(arr, n, k);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    long countSubarray(int arr[], int n, int k) {
        int s = 0;
        int i = 0;
        while(i < n) {
            int ct = 0;
            if (arr[i] > k) {
                i++;
                continue;
            }
            while (i < n && arr[i] <= k) {
                i++;
                ct++;
            }
            s += (long)(((long)ct * (long)(ct + 1)) / 2);
        }
        return (long)(((long)n * (long)(n + 1)) / 2 - s);
    }
}