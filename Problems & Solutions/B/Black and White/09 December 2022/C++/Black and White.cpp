//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

long long numOfWays(int n, int m);

int main() {
    // code
    int T;
    cin >> T;
    while (T--) {
        int n, m;
        cin >> n >> m;
        cout << numOfWays(n, m) << endl;
    }
    return 0;
}
// } Driver Code Ends

long long numOfWays(int n, int m) 
{
    static int x_off[] = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int y_off[] = {-1, 1, 2, 2, 1, -1, -2, -2};
    static const long long MOD = (long long)1e9 + 7;

    long long ret = 0;
    int x, y;

    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < m; ++j) 
        {
            for (int k = 0; k < 8; ++k)
            {
                x = i + x_off[k];
                y = j + y_off[k];
                if (x >= 0 && x < n && y >= 0 && y < m)
                    ++ret; 
            }
        }
    }
    long long total = n * m;
    
    total =(total * (total - 1)) % MOD; 
    
    return (total + MOD - ret) % MOD; 
    
}