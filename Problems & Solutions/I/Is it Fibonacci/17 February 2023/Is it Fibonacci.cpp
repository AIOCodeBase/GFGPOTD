//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    long long solve(int N, int K, vector<long long> GeekNum) {
      
        if (N < K) return GeekNum[N-1];
        
        vector<long long> dp(N, 0);
        long long sum = 0;
        
        for (int i=0; i<K; i++){
            dp[i] = GeekNum[i];
            sum += dp[i];
        }
        
        for (int i=K; i<N; i++){
            dp[i] = sum;
            sum += dp[i] - dp[i-K];
        }
        
        return dp[N-1];
    }
};


//{ Driver Code Starts.

int main() {
    int T;
    cin >> T;
    while (T--) {
        int N, K;
        cin >> N >> K;

        vector<long long> GeekNum(K);

        for (int i = 0; i < K; i++) cin >> GeekNum[i];

        Solution ob;
        cout << ob.solve(N, K, GeekNum) << "\n";
    }
    return 0;
}

// } Driver Code Ends
