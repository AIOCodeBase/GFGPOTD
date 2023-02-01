//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
	
	    #define ll long long int
      #define mod (int)(1e9+7)
        
	    int f(int ind,string& str,int n,vector<ll>& dp)
        {
            if(ind==n) return 1;
             
            if(dp[ind]!=-1) return dp[ind];
             
            int onech=0,twoch=0;
            
            if(str[ind]>='1' && str[ind]<='9') 
            {
                onech=f(ind+1,str,n,dp);
            }
            
            string temp=str.substr(ind,2);
            
            if(ind<n-1 && temp>="10" && temp<="26")
            {
                twoch=f(ind+2,str,n,dp);
            }
            
            return dp[ind]=(onech+twoch)%mod;
        }
		int CountWays(string str){
		    
		    int n=str.length();
	      vector<ll> dp(n,-1);
	      return f(0,str,n,dp);
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string str;
		cin >> str;
		Solution obj;
		int ans = obj.CountWays(str);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends
