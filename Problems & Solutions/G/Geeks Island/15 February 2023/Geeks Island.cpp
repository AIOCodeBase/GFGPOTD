//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{   
public:
    int water_flow(vector<vector<int>> &mat,int N,int M){
        
        vector<vector<bool>> first(N,vector<bool> (M,false));
        queue<pair<int,int>> Q;

        for(int i=0;i<N;i++)
        {
            Q.push({i,0});
        }
        
        for(int j=0;j<M;j++)
        {
            Q.push({0,j});
        }
        
        while(Q.size()>0)
        {
            pair<int,int> p=Q.front();
            Q.pop();
            int i=p.first;
            int j=p.second;
            
            if(first[i][j]==true)
                continue;
                
            first[i][j]=true;

            if(i-1>=0 && mat[i-1][j]>=mat[i][j])
                Q.push({i-1,j});

            if(i+1<N && mat[i+1][j]>=mat[i][j])
                Q.push({i+1,j});

            if(j-1>=0 && mat[i][j-1]>=mat[i][j])
                Q.push({i,j-1});

            if(j+1<M && mat[i][j+1]>=mat[i][j])
                Q.push({i,j+1});
        }

        vector<vector<bool>> second(N,vector<bool> (M,false));

        for(int i=0;i<N;i++)
        {
            Q.push({i,M-1});
        }

        for(int j=0;j<M;j++)
        {
            Q.push({N-1,j});
        }

        while(Q.size()>0)
        {
            pair<int,int> p=Q.front();
            Q.pop();
            int i=p.first;
            int j=p.second;

            if(second[i][j]==true)
                continue;

            second[i][j]=true;
            
            if(i-1>=0 && mat[i-1][j]>=mat[i][j])
                Q.push({i-1,j});

            if(i+1<N && mat[i+1][j]>=mat[i][j])
                Q.push({i+1,j});

            if(j-1>=0 && mat[i][j-1]>=mat[i][j])
                Q.push({i,j-1});

            if(j+1<M && mat[i][j+1]>=mat[i][j])
                Q.push({i,j+1});
        }

        int ans=0;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(first[i][j]&&second[i][j])
                    ans++;
            }
        }

        return ans;
    }
};



//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n,m;
        cin>>n>>m;
        vector<vector<int>> mat(n, vector<int>(m));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cin>>mat[i][j];
            }
        }
        Solution ob;
        cout << ob.water_flow(mat, n, m) << endl;
        
    }
}


// } Driver Code Ends
