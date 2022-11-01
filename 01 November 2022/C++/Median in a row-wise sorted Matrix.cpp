//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution{   
public:
    int median(vector<vector<int>> &matrix, int r, int c){
         int mini = matrix[0][0];
         int maxi = matrix[0][c-1];
         for(int i=1;i<r;i++){
             if(matrix[i][0] < mini){
                 mini = matrix[i][0];
             }
             if(matrix[i][c-1] > maxi)
             {
                 maxi = matrix[i][c-1];
             }
         }
         
         int medPos = (r*c + 1)/2;
         
         while(mini < maxi){
             int mid = (mini + maxi)/2;
             int midPos = 0;
             
             for(int i=0;i<r;i++){
                 midPos += upper_bound(matrix[i].begin(),matrix[i].end(),mid) - matrix[i].begin();
             }
             if(midPos < medPos){
                 mini = mid + 1;
             }
             else{
                 maxi = mid;
             }
         }
         return mini;
    }
};


//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int r, c;
        cin>>r>>c;
        vector<vector<int>> matrix(r, vector<int>(c));
        for(int i = 0; i < r; ++i)
            for(int j = 0;j < c; ++j)
                cin>>matrix[i][j];
        Solution obj;
        cout<<obj.median(matrix, r, c)<<endl;        
    }
    return 0;
}
// } Driver Code Ends