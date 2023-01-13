//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    long long int luckyPermutations(int N, int M, vector<int> arr,
                                    vector<vector<int>> graph) {
        
        bool adj[N][N];
        memset(adj,0,sizeof adj);
        for(auto edge:graph) adj[edge[0]-1][edge[1]-1]=adj[edge[1]-1][edge[0]-1]=1;
    
        long long dp[N][(1<<N)];
        memset(dp,0,sizeof dp);
        for(int i=0; i<N; i++) dp[i][(1<<i)] = 1;
        
        for(int subset=0; subset<(1<<N); subset++)
        {
            for(int curr=0; curr<N; curr++)
            {
                if(!(subset&(1<<curr))) continue;
                
                    for(int prev=0; prev<N; prev++)
                    {
                        if(curr==prev || arr[curr]==arr[prev]) continue;
                        
                        if(!(subset&(1<<prev))) continue;
                        
                        if(!adj[arr[prev]-1][arr[curr]-1]) continue;
                        
                        dp[curr][subset] += dp[prev][subset^(1<<curr)];
                        
                    }
            }
        }
        
        long long ans = 0;
        for(int i=0; i<N; i++)
        {
            ans+= dp[i][(1<<N)-1];
        }
        
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, M;
        cin >> N >> M;
        vector<int> arr(N);
        vector<vector<int>> graph(M, vector<int>(2));
        for (int i = 0; i < N; i++) {
            cin >> arr[i];
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
                cin >> graph[i][j];
            }
        }
        Solution obj;
        cout << obj.luckyPermutations(N, M, arr, graph) << endl;
    }
}

// } Driver Code Ends
