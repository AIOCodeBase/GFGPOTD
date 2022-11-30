//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
        int largestArea(int n,int m,int k,vector<vector<int>> &enemy)
        {
            //  code here
            vector<int> v1, v2;
            for(auto &it: enemy){
                v1.push_back(it[0]);
                v2.push_back(it[1]);
            }
            sort(v1.begin(), v1.end());
            sort(v2.begin(), v2.end());
            v1.push_back(n+1);
            v2.push_back(m+1);
            int rowMax = INT_MIN;
            int start = 0;
            for(auto &it: v1){
                rowMax = max(rowMax, it-start-1);
                start = it;
            }
            int colMax = INT_MIN;
            start = 0;
            for(auto &it: v2){
                colMax = max(colMax, it-start-1);
                start = it;
            }
            return rowMax * colMax;
        }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int k;
        cin>>k;
        vector<vector<int>> e(k,vector<int>(2));
        for(int i=0;i<k;i++)
            cin>>e[i][0]>>e[i][1];
        Solution a;
        cout<<a.largestArea(n,m,k,e)<<endl;
    }
    return 0;
}
// } Driver Code Ends