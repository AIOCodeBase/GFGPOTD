//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    void APUtil(vector<int> adj[], int u, bool visited[],
                int disc[], int low[], int &time, int parent,
                bool isAP[])
    {
        int children = 0;

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for (auto v : adj[u])
        {
            if (!visited[v])
            {
                children++;
                APUtil(adj, v, visited, disc, low, time, u, isAP);

                low[u]  = min(low[u], low[v]);

                if (parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }

            else if (v != parent)
                low[u]  = min(low[u], disc[v]);
        }


        if (parent == -1 && children > 1)
            isAP[u] = true;
    }

    vector<int> articulationPoints(int V, vector<int>adj[]) {

        vector<int> ans;


        int disc[V] = {0};
        int low[V];
        bool visited[V] = {false};
        bool isAP[V] = {false};
        int time = 0, par = -1;


        APUtil(adj, 0, visited, disc, low,
               time, par, isAP);

        for (int u = 0; u < V; u++)
            if (isAP[u] == true)
                ans.push_back(u);


        if (ans.size() == 0)
            ans.push_back(-1);

        return ans;
    }
};

//{ Driver Code Starts.

int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int V, E;
		cin >> V >> E;
		vector<int>adj[V];
		for(int i = 0; i < E; i++){
			int u, v;
			cin >> u >> v;
			adj[u].push_back(v);
			adj[v].push_back(u);
		}
		Solution obj;
		vector<int> ans = obj.articulationPoints(V, adj);
		for(auto i: ans)cout << i << " ";
		cout << "\n";
	}
	return 0;
}
// } Driver Code Ends