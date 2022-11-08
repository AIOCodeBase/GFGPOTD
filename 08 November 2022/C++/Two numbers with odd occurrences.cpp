//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{
    public:
    vector<long long int> twoOddNum(long long int a[], long long int N)  
    {
        long long int XOR = 0;
        for(int i = 0; i < N; i++)
            XOR ^= a[i];
        
        long long int p = 0;
        while (((1 << p) & XOR) == 0)
            p++;
        
        long long int val1 = 0, val2 = 0;
        for(int i = 0; i < N; i++)
            (1 << p) & a[i] ? val1 ^= a[i] : val2 ^= a[i];
        
        vector<long long int> ans;
        ans.push_back(val1);
        ans.push_back(val2);
        sort(ans.begin(), ans.end(), greater<int>());
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long int N;
        cin>>N;
        long long int Arr[N];
        for(long int i = 0;i < N;i++)
        cin>>Arr[i];
        Solution ob;
        vector<long long int>ans=ob.twoOddNum(Arr,N);
        for(long long int i=0;i<ans.size();i++)cout<<ans[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends