//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function template for C++

class Solution{   
public:
int numberOfSubsequences(string S, string W){
      int count=0;
      int i=0,j=0;
      int n=S.size();
      int k=W.size();
      bool lookup[n]={false};
      while(i<n){
        if(S[i]==W[j] && !lookup[i]){
          j++;
          lookup[i]=true;
          if(j==k){
            i=0;
            j=0;
            count++;
          }
        }
        i++;
      }
      return count;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string S,W;
        cin >> S >> W;
        Solution ob;
        cout << ob.numberOfSubsequences(S,W) << endl;
    }
    return 0; 
} 


// } Driver Code Ends