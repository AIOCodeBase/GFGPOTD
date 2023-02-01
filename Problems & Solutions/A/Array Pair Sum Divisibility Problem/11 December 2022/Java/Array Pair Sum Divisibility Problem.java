//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends

class Solution {
    public boolean canPair(int ar[], int k) {
        if (ar.length % 2 == 1) return false;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int rem = ((ar[i] % k) + k) % k;
            if (!hm.containsKey(rem)) {
                hm.put(rem, 0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }

        for (int i = 0; i < ar.length; i++) {
            int rem = ((ar[i] % k) + k) % k;

            if (2 * rem == k) {
                if (hm.get(rem) % 2 == 1) return false;
            }

            else if (rem == 0) {
                if (hm.get(rem) % 2 == 1) return false;
            }

            else {
                if (hm.get(k - rem) != hm.get(rem)) return false;
            }
        }
        return true;
    }
}
