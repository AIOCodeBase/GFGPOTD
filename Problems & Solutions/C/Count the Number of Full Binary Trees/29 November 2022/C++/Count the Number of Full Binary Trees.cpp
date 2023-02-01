//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
public:
    long long int numoffbt(long long int arr[], int n){
        long long int maxvalue = INT_MIN, minvalue = INT_MAX;
        for (int i = 0; i < n; i++){
            maxvalue = max(maxvalue, arr[i]);
            minvalue = min(minvalue, arr[i]);
        }
     
        long long int mark[maxvalue + 2]={0};
        long long int value[maxvalue + 2]={0};
        for (int i = 0; i < n; i++){
            mark[arr[i]] = value[arr[i]] = 1;
        }
        long long int ans = 0, mod=1000000007;
        for (long long int i = minvalue; i <= maxvalue; i++)
        {
            if (mark[i])
            {
                for (int j = i + i; j <= maxvalue && j/i <= i; j += i)
                {
                    if (!mark[j])
                        continue;
                    value[j] = (value[j] + (value[i] * value[j/i]))%mod;
                    if (i != j/i)
                        value[j] = (value[j] + (value[i] * value[j/i]))%mod;
                }
            }
            ans = (ans+value[i])%mod;
        }
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		long long int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution ob;
		cout<<ob.numoffbt(a,n)<<endl;
		
	}
	return 0;
}


// } Driver Code Ends
