//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:

    bool dfs(vector<vector<int>>& G, int u, vector<bool>& used, int match[]) {

        for (int v = 0; v < G[0].size(); v++) {
    
            if (G[u][v] == 1 && !used[v]) {
                used[v] = true;
                if (match[v] == -1 || dfs(G, match[v], used, match)) {
                    match[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
    
	int maximumMatch(vector<vector<int>>&G){

	    int m = G.size();
        int n = G[0].size();
        int match[n];
    
        memset(match, -1, sizeof(match));
        int res = 0;
    
        for (int i = 0; i < m; i++) {
            
            vector<bool> used(n, false);
            if ( dfs(G, i, used, match) ) res++;
        }
        return res;
	}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int m, n;
		cin >> m >> n;
		vector<vector<int>>G(m, vector<int>(n, 0));
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++)
				cin >> G[i][j];
		}
		Solution obj;
		int ans = obj.maximumMatch(G);
		cout << ans << "\n";    
	}
	return 0;
}
// } Driver Code Ends