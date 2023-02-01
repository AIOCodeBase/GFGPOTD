//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int isItPossible(string S, string T, int M, int N) {
        // code here
        
        int i=0, j=0;
        
        if(M!=N) return 0;
        
        while(i<M || j<N){
            
            while(S[i]=='#') i++;
            while(T[j]=='#') j++;
            
            if(i>=M && j<N) return 0;
            if(i<M && j>=N) return 0;
            
            if(S[i]!=T[j]) return 0;
            else{
                if(S[i]=='A' && i<j) return 0;
                else if(S[i]=='B' && i>j) return 0;
            }
            
            i++;
            j++;
        }
        
        return 1;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S, T;
        cin >> S >> T;
        int M = S.length(), N = T.length();
        Solution ob;
        cout << ob.isItPossible(S, T, M, N);
        cout << "\n";
    }
}
// } Driver Code Ends