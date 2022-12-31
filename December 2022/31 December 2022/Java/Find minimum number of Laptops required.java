//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends

class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0; i<N; i++)
        {
            if (mp.containsKey(start[i]))
                mp.put(start[i], mp.get(start[i])+1);
            else
                mp.put(start[i],1);
        }
        for(int i=0; i<N; i++)
        {
            if (mp.containsKey(end[i]))
                mp.put(end[i], mp.get(end[i])-1);
            else
                mp.put(end[i],-1);
        }
            
        int[][] s = new int[2*N][2];
        
        int ind = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet())
        {
            s[ind][0] = e.getKey();
            s[ind][1] = e.getValue();
            ind++;
        }
        
        Arrays.sort(s, Comparator.<int[]>comparingInt(a->a[0])
                               .thenComparingInt(a->a[1]));
                               
                               
        int c=0,ans=0;
        for(int i=0; i<2*N; i++)
        {
            c+=s[i][1];
            ans=Math.max(ans,c);
        }
        return ans;
    }
}