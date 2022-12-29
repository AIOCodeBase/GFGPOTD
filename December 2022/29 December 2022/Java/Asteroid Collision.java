//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                s.push(i);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(i)) {
                    s.pop();
                }
                if (s.isEmpty() || s.peek() < 0) {
                    s.push(i);
                } else if (i + s.peek() == 0) {
                    s.pop();
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}
