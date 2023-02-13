//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    int maxInstance(string s){
        
        unordered_map<char, int> mp;
        int mini = INT_MAX;
        
        for (int i=0; i<s.length(); i++){
            mp[s[i]]++;
        }
            
        mini = min({mp['b'], mp['a'], mp['l']/2, mp['o']/2, mp['n']});
        return mini;
    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        Solution ob;
        cout<<ob.maxInstance(s)<<endl;
    }
    return 0;
}
// } Driver Code Ends