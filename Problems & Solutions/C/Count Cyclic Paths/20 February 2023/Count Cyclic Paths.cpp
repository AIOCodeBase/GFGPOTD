//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Solution{   
public:
    int countPaths(int N){
        // code here
        if (N==1) return 0;
        if (N==2) return 3;
        if (N==3) return 6;
        
        int m = pow(10,9) + 7;
        long long int arr[N+1] = {0};
        arr[1]=0;
        arr[2]=3;
        arr[3]=6;
        
        for (int i=4; i<=N; i++){
            arr[i] = ( (arr[i-1]*2)%m + (arr[i-2]*3)%m )%m;
        }
        
        return arr[N];
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        
        Solution ob;
        cout << ob.countPaths(N) << endl;
    }
    return 0; 
}

// } Driver Code Ends
