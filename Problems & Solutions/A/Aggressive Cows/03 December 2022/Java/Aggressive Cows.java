//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int ceilSearch(int arr[], int low, int high, int x) {
        int mid;

        if (x <= arr[low]) return low;

        if (x > arr[high]) return -1;

        mid = (low + high) / 2; /* low + (high - low)/2 */

        if (arr[mid] == x)
            return mid;

        else if (arr[mid] < x) {
            if (mid + 1 <= high && x <= arr[mid + 1])
                return mid + 1;
            else
                return ceilSearch(arr, mid + 1, high, x);
        }

        else {
            if (mid - 1 >= low && x > arr[mid - 1])
                return mid;
            else
                return ceilSearch(arr, low, mid - 1, x);
        }
    }
    static boolean valid(int a[], int c, int x) {
        int n = a.length;
        int pos = a[0];
        int cow = 1;
        while (pos <= a[n - 1]) {
            pos += x;
            int ind = ceilSearch(a, 0, n - 1, pos);
            if (ind == -1) return false;
            pos = a[ind];
            cow++;
            if (cow >= c) return true;
        }

        return cow >= c;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);

        int low = 0, high = (int)1e9;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (valid(stalls, k, mid))
                low = mid;
            else
                high = mid;
        }
        return low;
    }
}