//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    int findMaxSum(int arr[], int n) {
        if (n == 0) return 0;

	    int value1 = arr[0];
	    if (n == 1) return value1;

	    int value2 = Math.max(arr[0], arr[1]);
	    if (n == 2) return value2;

	    int max_sum = 0;

	    for (int i = 2; i < n; i++) {
	        max_sum = Math.max(arr[i] + value1, value2);
	        value1 = value2;
	        value2 = max_sum;
	    }

	    return max_sum;
    }
}
