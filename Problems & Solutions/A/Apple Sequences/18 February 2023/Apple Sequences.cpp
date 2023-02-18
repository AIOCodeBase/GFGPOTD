//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Solution{   
public:
    int appleSequences(int n, int m, string arr){
        // code here 
        int maxlen = 0;
        int end = 0, start = 0;
        int count = 0;
        
        while(end < n)
        {
            if(arr[end] == 'O') count++;
            
            while(start < n && count > m)
            {
                if(arr[start] == 'O') count--;
                start++;
            }
            
            maxlen = max(maxlen, end-start+1);
            end++;
        }
        
        return maxlen;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N, M;
        cin >> N >> M;
        string arr;
        cin >> arr;
        
        Solution ob;
        cout << ob.appleSequences(N, M, arr) << endl;
    }
    return 0; 
} 
// } Driver Code Ends
