//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
    #define ll long long
  public:
    ll countPairs(int n, int arr[], int k) {
        
        ll cnt = 0;
      
        for (ll i = 0; i < n; i++) {
            arr[i] = (arr[i] + k) % k;
        }
      
        ll hash[k] = { 0 };
      
        for (ll i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
      
        for (ll i = 0; i < k; i++) {
            cnt += (hash[i] * (hash[i] - 1)) / 2;
        }
      
        return cnt;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,k;
        cin>>n;
        
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        
        cin>>k;

        Solution ob;
        cout << ob.countPairs(n,arr,k) << endl;
    }
    return 0;
}
// } Driver Code Ends