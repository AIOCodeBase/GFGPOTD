//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        long max_sum = -1;
        long cur_sum = 0;
        int max_range_left = -1;
        int max_range_right = -1;
        int cur_range_left = 0;
        int cur_range_right = 0;
        while (cur_range_right < n) {
            if (a[cur_range_right] < 0) {
                cur_range_left = cur_range_right + 1;
                cur_sum = 0;
            } else {
                cur_sum += (long)a[cur_range_right];
                if (cur_sum > max_sum) {
                    max_sum = cur_sum;
                    max_range_left = cur_range_left;
                    max_range_right = cur_range_right;
                } else if (cur_sum == max_sum) {
                    if (cur_range_right + 1 - cur_range_left >
                        max_range_right + 1 - max_range_left) {
                        max_range_left = cur_range_left;
                        max_range_right = cur_range_right;
                    }
                }
            }
            cur_range_right++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (max_range_left == -1 || max_range_right == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = max_range_left; i <= max_range_right; ++i) ans.add(a[i]);
        return ans;
    }
}