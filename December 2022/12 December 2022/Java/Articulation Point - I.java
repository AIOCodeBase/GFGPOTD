//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    static int time;
    void APUtil(ArrayList<ArrayList<Integer>> adj, int u, boolean visited[], int disc[], int low[], int parent, boolean isAP[])
    {
        int children = 0;

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for(Integer v : adj.get(u))
        {
            if(!visited[v])
            {
                children++;
                APUtil(adj, v, visited, disc, low, u, isAP);

                low[u] = Math.min(low[u], low[v]);

                if(parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }
            else if(v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }

        if(parent == -1 && children > 1)
            isAP[u] = true;
    }

    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int[] disc = new int[V], low = new int[V];
        boolean[] visited = new boolean[V], isAP = new boolean[V];
        int par = -1;
        time = 0;

        APUtil(adj, 0, visited, disc, low, par, isAP);

        for(int u = 0; u < V; u++)
            if(isAP[u])
                ans.add(u);

        if(ans.size() == 0)
            ans.add(-1);

        return ans;
    }
}