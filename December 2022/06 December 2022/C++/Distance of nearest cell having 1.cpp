//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution 
{
    public:
	vector<int>dx = {1,-1,0,0};
	vector<int>dy = {0,0,1,-1};
	
	bool isValid(int x, int y, int n, int m){
		return (x >=0 and x < n and y >=0 and y < m);
	}
	
	vector<vector<int>>nearest(vector<vector<int>>grid)
	{
		int n = grid.size();
		int m = grid[0].size();
		
		queue<pair<int, int>>q;
		
		vector<vector<int>>dp(n, vector<int>(m, INT_MAX));
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(grid[i][j] == 1){
					dp[i][j] = 0;
					q.push({i,j});
				}
			}
		}
		
		while(!q.empty())
		{
			int x = q.front().first;
			int y = q.front().second;
			q.pop();
			
			for(int i = 0; i < 4; i++)
			{
				int n_x = x + dx[i];
				int n_y = y + dy[i];
				if(isValid(n_x, n_y, n, m) and dp[n_x][n_y] > dp[x][y] + 1)
				{
					dp[n_x][n_y] = dp[x][y] + 1;
					q.push({n_x, n_y});
				}
			}
		}
		return dp;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>>grid(n, vector<int>(m, -1));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> grid[i][j];
			}
		}
		Solution obj;
		vector<vector<int>> ans = obj.nearest(grid);
		for(auto i: ans){
			for(auto j: i){
				cout << j << " ";
			}
			cout << "\n";
		}
	}
	return 0;
}
// } Driver Code Ends