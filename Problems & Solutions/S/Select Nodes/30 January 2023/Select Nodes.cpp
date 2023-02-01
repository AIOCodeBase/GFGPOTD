//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Solution{
  public:
  
    vector<int> vis;
    int count = 0;
    bool dfs(vector<int> adj[], int i){
        vis[i] = 1;
        bool select = false;
        
        for (auto j:adj[i]){
            
            if(!vis[j] && !dfs(adj, j)) select = true;
        }
        if (select){
            count++;
        }
        return select;
    }
    
    int countVertex(int N, vector<vector<int>>edges){
        
        vector<int> adj[N+1];
        vis = vector<int>(N+1, 0);
        
        for(auto i:edges){
            adj[i[0]].push_back(i[1]);
            adj[i[1]].push_back(i[0]);
        }
        
        dfs(adj, 1);
        return count;
    }
};

//{ Driver Code Starts.

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        vector<vector<int>>edges;
        for(int i = 0; i < N-1; i++){
            int x,y;
            cin >> x >> y;
            vector<int> edge;
            edge.push_back(x);
            edge.push_back(y);
            edges.push_back(edge);
        }
        
        Solution ob;
        cout << ob.countVertex(N, edges) << endl;
    }
    return 0; 
} 
// } Driver Code Ends
