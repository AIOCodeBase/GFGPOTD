//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int checkCompressed(string S, string T) {
        // code here
        int i=0,j=0;
        
        while(i<S.length() && j<T.length())
        {
            if(S[i]==T[j])
            {
                i++;
                j++;
                continue;
            }
            if(T[j]-'0'==0) 
            {
                j++;
                continue;
            }
            
            int count=0;
            while(j<T.length() && isdigit(T[j]))
            {
                count=count*10 + (T[j]-'0');
                j++;
            }
            
            i+=count;
            if(count==0) return 0;
        }
        return i==S.length() && j==T.length();
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S,T;
        
        cin>>S>>T;

        Solution ob;
        cout << ob.checkCompressed(S,T) << endl;
    }
    return 0;
}
// } Driver Code Ends
