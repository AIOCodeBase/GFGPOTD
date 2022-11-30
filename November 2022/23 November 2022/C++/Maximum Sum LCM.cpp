//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution {
  public:
    long long int maxSumLCM(int n) 
    { 
        long long int max_sum = 0;
        for (int i=1; i*i<=n; i++) 
        { 
            if (n%i == 0) 
            { 
                max_sum += i; 
                if (n/i != i) 
                    max_sum += (n/i); 
            } 
        } 
      
        return max_sum; 
    } 
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int  n;
        cin >> n ;
        Solution ob;
        cout<<ob.maxSumLCM(n)<<endl;
    }
    return 0;
}

// } Driver Code Ends