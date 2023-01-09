//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException {
		BufferedReader read =
		new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			String S[] = read.readLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(S[i]);
			int k = Integer.parseInt(read.readLine());

			Solution ob = new Solution();
			System.out.println(ob.countPairs(n, arr, k));
		}
	}
}
// } Driver Code Ends

class Solution {
	static long countPairs(int n, int[] arr, int k) {

		long cnt = 0;

		for (int i = 0; i < n; i++)
		{
			arr[i] = (arr[i] + k) % k;
		}

		long hash[] = new long[k];
		Arrays.fill(hash, 0);

		for (int i = 0; i < n; i++)
		{
			hash[arr[i]]++;
		}

		for (int i = 0; i < k; i++)
		{
			cnt += (hash[i] * (hash[i] - 1)) / 2;
		}

		return cnt;
	}
}