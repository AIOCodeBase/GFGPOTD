//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    string removePair(string s) {
        
        int j = -1;
        
        for(int i=0; i<s.size(); i++)
        {
            if(j >= 0 && s[j] == s[i]) j--;
            else s[++j] = s[i];
        }
        
        return j < 0 ? "-1" : s.substr(0, j+1);
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string s; 
        cin>>s;
        
        Solution obj;
        string res = obj.removePair(s);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends
