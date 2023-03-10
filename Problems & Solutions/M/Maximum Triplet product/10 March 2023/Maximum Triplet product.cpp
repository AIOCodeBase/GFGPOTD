//{ Driver Code Starts
//Initial Template for CPP

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    long long maxTripletProduct(long long arr[], int n)
    {
        // if size is less than 3, triplets doesn't exist
    	if (n < 3) return -1;
    	// sort an array in ascending order
    	sort(arr, arr+n);
    	// return the max of first three elements and first two & last one elements
    	return max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
    }
};

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n,i;
	    cin>>n; long long arr[n];
	    for(i=0;i<n;i++)
	    cin>>arr[i];
	    Solution ob;
	    cout <<ob.maxTripletProduct(arr, n);
	    cout<<"\n";
	}
    return 0;
}
// } Driver Code Ends
