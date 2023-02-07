//{ Driver Code Starts
//Initial Template for C++



#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
    public:
        // Function to return the length of the
        //longest subarray with ppositive product
        int maxLength(vector<int> &arr,int n){
           //code here
           int res = 0;
           int Pos = 0, Neg = 0;
           
           for (int i=0; i<n; i++){
               
               if (arr[i] == 0){
                   Pos = Neg = 0;
               }
               
               else if (arr[i] > 0){
                   
                   Pos += 1;
                   
                   if (Neg != 0){
                       Neg += 1;
                   }
                   
                   res = max(res, Pos);
               }
               
               else{
                   
                   swap(Pos, Neg);
                   
                   Neg += 1;
                   
                   if (Pos != 0){
                       Pos += 1;
                   }
                   
                   res = max(res, Pos);
               }
           }
           return res;
        }
};

//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<int> arr(n);
	    for(int i = 0;i<n;i++){
	        cin>>arr[i];
	    }
	    Solution ob;
	    int res = ob.maxLength(arr,n);
	    cout<<res<<"\n";
	}
	return 0;
}
// } Driver Code Ends