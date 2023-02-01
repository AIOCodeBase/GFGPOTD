//{ Driver Code Starts
//Initial function template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution{
public:
    long long int findSubarray(vector<long long int> &arr ,int n) {
        
        long long int sum=0, counter=0; 
         
        unordered_map<long long int,long long int>mp;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
            if(sum==0) 
            {
                counter++; 
            }
            
            if(mp.count(sum)!=0) 
            {
               counter+=mp[sum]; 
            }
            
            mp[sum]++; 
        }
        return counter ;
    }
};

//{ Driver Code Starts.
int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n; //input size of array
       
        vector<long long int> arr(n,0);
        
        for(int i=0;i<n;i++)
            cin>>arr[i]; //input array elements
        Solution ob;
        cout << ob.findSubarray(arr,n) << "\n";
    }
	return 0;
}
// } Driver Code Ends