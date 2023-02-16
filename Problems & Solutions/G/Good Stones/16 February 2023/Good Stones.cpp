//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++
class Solution{
public:

    int solve(int i, int n, vector<int> &dp, vector<int> &arr){
        if (i<0 || i>=n){
            return 1;
        }
        
        if (dp[i] != -1){
            return dp[i];
        }
        
        dp[i] = 0;
        
        return dp[i] = solve(i+arr[i], n, dp, arr);
    }
    
    int goodStones(int n,vector<int> &arr){
        vector<int> dp(n, -1);
        
        for(int i=0; i<n; i++){
            solve(i, n, dp, arr);
        }
        
        int ans = accumulate(dp.begin(), dp.end(), 0);
        return ans;
    }  
};

//{ Driver Code Starts.

int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        Solution ob;
        cout<<ob.goodStones(n,arr)<<endl;
    }
    return 0;
}
// } Driver Code Ends
