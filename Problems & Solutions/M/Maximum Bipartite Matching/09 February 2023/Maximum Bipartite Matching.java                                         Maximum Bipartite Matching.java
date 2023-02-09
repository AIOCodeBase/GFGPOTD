//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            int[][] G = new int[m][n];
            for(int i = 0; i < m; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    G[i][j] = Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            int ans = obj.maximumMatch(G);
            out.println(ans);
       }
       out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     public static void main(String[] args) {

    }

    public boolean fun(int u, int[][] G, boolean[] Jobs, int[] visit) {

        int N = G.length;

        int M = G[0].length;

        for (int v = 0; v < M; v++) {

            if (G[u][v] == 1 && !Jobs[v]) {

                Jobs[v] = true;

                if (visit[v] < 0 || fun(visit[v], G, Jobs, visit)) {

                    visit[v] = u;

                    return true;

                }

            }

        }

        return false;

    }

    public int maximumMatch(int[][] G)

    {

        int appointedJob = 0;

        int N = G.length;

        int M = G[0].length;

        int[] visit = new int[M];

        for (int i = 0; i < M; i++)
            visit[i] = -1;

        for (int i = 0; i < N; i++) {

            boolean[] Jobs = new boolean[M];

            if (fun(i, G, Jobs, visit))
                appointedJob++;

        }

        return appointedJob;

    }
}
