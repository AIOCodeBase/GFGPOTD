//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
	using ll = long long int;
	ll mod = 1e9 + 7;
	ll modpow(ll a, ll b)
	{
	    ll x = 1%mod;
	    a %= mod;
	    while(b)
	    {
	        if(b&1)
	            x = (x*a)%mod;
	        a = (a*a)%mod;
	        b >>= 1;
	    }
	    return x;
	}
	ll modinverse(ll a)
	{
	    return modpow(a,mod-2);
	}
	int compute_value(int n)
	{
		if(n==1)
		return 2;
		ll val=2;
		for(ll i=1;i<n;i+=1)
		{
		   val=(val%mod*((2*i)%mod+1)%mod*2)%mod;
		   ll x=modinverse(i+1);
		   val=(val*x)%mod;
		}
		return (int)val;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		int ans = ob.compute_value(n);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends