//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

class Solution{   
public:
    int waysToBreakNumber(int N)
    {
        int mod = 1e9+7;
        long long int ans = (N+1)%mod;
        ans = ((ans%mod)*((N+2)%mod))%mod;
        ans/=2;
        ans%=mod;
        return ans;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.waysToBreakNumber(N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends