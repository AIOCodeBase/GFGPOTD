//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    int minOperation(string s) {
       
        int n = s.size();
        int cnt = 1;
        
        for(int i=0; i<n/2; i++){
             int dup = 0;
             int x = i+1;
             
            for(int j=x; j<2*x; j++){
                if(s[j-i-1] == s[j]) dup++;
                else break;
            } 
            cnt = max(cnt,dup);
        }
        return n-cnt+1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.minOperation(s) << "\n";
    }
    return 0;
}

// } Driver Code Ends
