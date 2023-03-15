//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{
    public:
    
        int dp[405][405];
        int max_earn(vector<int>&a,int l,int r){
            if(l>r)
                return 0;
            int ans=INT_MIN;
            if(dp[l][r]!=-1)return dp[l][r];
            for(int k=l;k<=r;k++){
                ans=max(ans,max_earn(a,l,k-1)+max_earn(a,k+1,r)+a[k]*(l-1>=0?a[l-1]:1)*(r+1<a.size()?a[r+1]:1));
            }
            return dp[l][r]=ans;
        }
        
        int maxCoins(int N, vector <int> &a)
        {
            memset(dp,-1,sizeof(dp));
            return max_earn(a,0,a.size()-1);
        }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<int> a(n);
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution S;
        cout<<S.maxCoins(n,a)<<endl;
    }
    return 0;
}
// } Driver Code Ends
