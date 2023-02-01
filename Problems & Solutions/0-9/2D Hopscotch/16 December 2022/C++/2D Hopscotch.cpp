//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
public:
    bool valid(int i, int j, int n, int m) {
        if(i >= 0 && j >= 0 && i < n && j < m)
            return true;
        return false;
    }
    
    int hopscotch(int n, int m, vector<vector<int>> mat, int ty, int i, int j)
    {
        int sum = 0;
        if(ty == 0) {
            if(j%2 == 0) {
                if(valid(i-1, j-1, n, m)) sum += mat[i-1][j-1];
                if(valid(i-1, j, n, m)) sum += mat[i-1][j];
                if(valid(i-1, j+1, n, m)) sum += mat[i-1][j+1];
                if(valid(i, j-1, n, m)) sum += mat[i][j-1];
                if(valid(i, j+1, n, m)) sum += mat[i][j+1];
                if(valid(i+1, j, n, m)) sum += mat[i+1][j];
            }
            else{
                if(valid(i-1, j, n, m)) sum += mat[i-1][j];
                if(valid(i, j-1, n, m)) sum += mat[i][j-1];
                if(valid(i, j+1, n, m)) sum += mat[i][j+1];
                if(valid(i+1, j-1, n, m)) sum += mat[i+1][j-1];
                if(valid(i+1, j, n, m)) sum += mat[i+1][j];
                if(valid(i+1, j+1, n, m)) sum += mat[i+1][j+1];
            }
        }
        else{
            if(j%2 == 0) {
                if(valid(i-2, j-1, n, m)) sum += mat[i-2][j-1]; 
                if(valid(i-2, j, n, m)) sum += mat[i-2][j];
                if(valid(i-2, j+1, n, m)) sum += mat[i-2][j+1]; 
                if(valid(i-1, j-2, n, m)) sum += mat[i-1][j-2];
                if(valid(i-1, j+2, n, m)) sum += mat[i-1][j+2]; 
                if(valid(i, j-2, n, m)) sum += mat[i][j-2];
                if(valid(i, j+2, n, m)) sum += mat[i][j+2]; 
                if(valid(i+1, j-2, n, m)) sum += mat[i+1][j-2];
                if(valid(i+1, j-1, n, m)) sum += mat[i+1][j-1]; 
                if(valid(i+1, j+1, n, m)) sum += mat[i+1][j+1];
                if(valid(i+1, j+2, n, m)) sum += mat[i+1][j+2]; 
                if(valid(i+2, j, n, m)) sum += mat[i+2][j];
            }
            else{
                if(valid(i-1, j-2, n, m)) sum += mat[i-1][j-2]; 
                if(valid(i-1, j-1, n, m)) sum += mat[i-1][j-1];
                if(valid(i-2, j, n, m)) sum += mat[i-2][j]; 
                if(valid(i-1, j+1, n, m)) sum += mat[i-1][j+1];
                if(valid(i-1, j+2, n, m)) sum += mat[i-1][j+2]; 
                if(valid(i, j-2, n, m)) sum += mat[i][j-2];
                if(valid(i, j+2, n, m)) sum += mat[i][j+2]; 
                if(valid(i+1, j-2, n, m)) sum += mat[i+1][j-2];
                if(valid(i+1, j+2, n, m)) sum += mat[i+1][j+2]; 
                if(valid(i+2, j-1, n, m)) sum += mat[i+2][j-1];
                if(valid(i+2, j, n, m)) sum += mat[i+2][j]; 
                if(valid(i+2, j+1 ,n, m)) sum += mat[i+2][j+1];
            }
        }
        return sum;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, m, ty, i, j;
        cin>>n>>m;
        vector<vector<int>> mat(n, vector<int>(m, 0));
        for(int i = 0;i < n;i++)
            for(int j = 0;j < m;j++)
                cin>>mat[i][j];
        cin>>ty>>i>>j;
        
        Solution ob;
        cout<<ob.hopscotch(n, m, mat, ty, i, j)<<"\n";
    }
    return 0;
}
// } Driver Code Ends