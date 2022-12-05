//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int shotestPath(vector<vector<int>> mat, int n, int m, int k) {
        queue<vector<int>> q;
        vector<vector<int>> obstacles(n, vector<int>(m, INT_MAX));
        const vector<vector<int>> dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    
        obstacles[0][0] = mat[0][0];
        q.push({0, 0});
        int steps = 0;
        while (!q.empty()) {
            for (int l = q.size(); l > 0; --l)
            {
                vector<int> pair = q.front();
                int i = pair[0], j = pair[1];
                q.pop();
                if (i == n - 1 and j == m - 1)
                    return steps;
                for (const auto& dir : dirs)
                {
                    const int x = i + dir[0];
                    const int y = j + dir[1];
                    if (x < 0 or y < 0 or x >= n or y >= m)
                        continue;
                    if (mat[x][y] + obstacles[i][j] > k)
                        continue;
                    if (obstacles[x][y] <= mat[x][y] + obstacles[i][j])
                        continue;
                    obstacles[x][y] = mat[x][y] + obstacles[i][j];
                    q.push({x, y});
                }
            }
            steps += 1;
        }
    
        return -1;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m, k, x;
        
        cin>>n>>m>>k;
        vector<vector<int>> mat;
    
        for(int i=0; i<n; i++)
        {
            vector<int> row;
            for(int j=0; j<m; j++)
            {
                cin>>x;
                row.push_back(x);
            }
            mat.push_back(row);
        }

        Solution ob;
        cout<<ob.shotestPath(mat,n,m,k);
        cout<<"\n";
    }
    return 0;
}
// } Driver Code Ends