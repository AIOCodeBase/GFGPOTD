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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.maxGcd(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    long gcd(long A, long B) {
        if (B == 0) return A;
        return gcd(B, A % B);
    }
    long lcm(int N) {
        if (N == 4) return 12;
        long a = N * (N - 1);
        long b = a;
        b *= (N - 2) / gcd(b, N - 2);
        b *= (N - 3) / gcd(b, N - 3);
        long c = a, f = 0;
        for (int i = N - 2; i >= 1; i--) {
            if (gcd(c, i) == 1) {
                a *= i;
                c *= i;
                f++;
            }
            if (f == 2) break;
        }
        return Math.max(a, b);
    }
    long maxGcd(int N) {
        if(N==4)return 12;
        return Math.max(lcm(N), lcm(N-1));
    }
}
