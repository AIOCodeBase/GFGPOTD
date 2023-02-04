//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	// calculate the maximum sum with out adjacent
	int findMaxSum(int *arr, int n) {
	    
	    int dp[n][2];
	    if (n == 1){
	        return arr[0];
	    }
	    
	    dp[0][0] = 0;
	    dp[0][1] = arr[0];
	    
	    for (int i=1; i<n; i++){
	   
	        dp[i][1] = dp[i-1][0] + arr[i];
	        dp[i][0] = max(dp[i-1][0], dp[i-1][1]);
	    }
	    
	    return max(dp[n-1][1], dp[n-1][0]);
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.findMaxSum(arr, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends