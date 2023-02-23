//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
  
    int mod = 1e9+7;

  vector<vector<int>>dp;

  int solve(int i,int j,int n,int m,vector<vector<int>>&grid){

      if(i >= n || j >= m || grid[i][j] == 0)

        return 0;

      if(i == n-1 && j == m-1)

        return 1;

      if(dp[i][j] != -1)

        return dp[i][j];

      grid[i][j] = 0;

      

      int ans = solve(i+1, j, n, m, grid)%mod;

      ans = (ans%mod + solve(i,j+1,n,m,grid)%mod)%mod;

      grid[i][j] = 1;

      return dp[i][j] = ans;

  }

    int uniquePaths(int n, int m, vector<vector<int>> &grid) {

        dp.resize(n,vector<int>(m,-1));

        return solve(0, 0, n, m, grid);

    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,m,x;
        cin>>n>>m;
        
        vector<vector<int>> grid(n,vector<int>(m));
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                cin>>grid[i][j];
            }
        }

        Solution ob;
        cout << ob.uniquePaths(n,m,grid) << endl;
    }
    return 0;
}
// } Driver Code Ends
