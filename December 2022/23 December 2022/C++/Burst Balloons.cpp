//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
public:
	int maxCoins(int N, vector<int> &arr)
	{
		arr.insert(arr.begin(), 1);
		arr.push_back(1);
		vector<vector<int>> dp(arr.size(), vector<int>(arr.size(), 0));
		for (int len = 1; len <= N; ++len)
			for (int left = 1; left <= N - len + 1; ++left)
			{
				int right = left + len - 1;
				for (int k = left; k <= right; ++k)
					dp[left][right] = max(dp[left][right], arr[left - 1] * arr[k] * arr[right + 1] + dp[left][k - 1] + dp[k + 1][right]);
			}
		return dp[1][N];
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin>>N;
        
        vector<int> arr(N);
        for(int i=0; i<N; i++)
            cin>>arr[i];

        Solution obj;
        cout << obj.maxCoins(N, arr) << endl;
    }
    return 0;
}
// } Driver Code Ends