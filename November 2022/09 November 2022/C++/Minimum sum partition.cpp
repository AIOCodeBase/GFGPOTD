//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{

  public:
	int minDifference(int arr[], int n)
	{ 
	    int s=0;
	    for(int i=0;i<n;i++) s+=arr[i];
	    bool dp[s/2+1];
	    memset(dp,0,sizeof(dp));
	    dp[0]=1;
	    for(int i=0;i<n;i++) for(int j=s/2;j>=arr[i];j--) dp[j]|=dp[j-arr[i]];
	    for(int i=s/2;i>=0;i--) if(dp[i])return s-2*i;
	    return 0;
	} 
};


//{ Driver Code Starts.
int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int a[n];
        for(int i = 0; i < n; i++)
        	cin >> a[i];

       

	    Solution ob;
	    cout << ob.minDifference(a, n) << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends