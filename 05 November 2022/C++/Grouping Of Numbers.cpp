//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int maxGroupSize(int arr[], int n, int k) {
        int fre[k]{} ;
        for(int i = 0; i < n; i++)
        {
            fre[arr[i]%k]++ ;
        }
        int ans = 0 ;
        ans += (fre[0] > 0) ;
        for(int i = 1; i < k; i++)
        {
            if(2*i == k)
            {
                ans += (fre[i] > 0) ;
                break ;
            }
            if(2*i > k) break ;
            ans += max(fre[i], fre[k-i]) ;
        }
        return ans ;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N,K;
        
        cin>>N>>K;
        int arr[N];
        
        for(int i=0; i<N; i++)
            cin>>arr[i];

        Solution ob;
        cout << ob.maxGroupSize(arr,N,K) << endl;
    }
    return 0;
}
// } Driver Code Ends