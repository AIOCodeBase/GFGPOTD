//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
        long long int maximizeMinHeight(int n,int k,int w,vector <int> &a)
        {
            int mn = *min_element(a.begin(), a.end());
            int mx = mn + k + 1;
            
            auto f = [&] (int ht) {
                int days = 0, curr_ht = a[0];
                vector <int> flower(n + 1);
                
                int diff = max(0, ht - curr_ht);
                
                flower[0] += diff;
                days += diff;
                flower[w] -= diff;
                
                for(int i = 1; i < n; i++) {
                    flower[i] += flower[i - 1];
                    
                    int curr_ht = a[i] + flower[i];
                    
                    diff = max(0, ht - curr_ht);
                    flower[i] += diff;
                    days += diff;
                    
                    if(i + w < n) {
                        flower[i + w] -= diff;
                    }
                }
                
                return days <= k;
            };
            
            while(mn < mx) {
                int ht = (mn + mx) / 2;
                if(!f(ht)) 
                    mx = ht;
                else 
                    mn = ht + 1;
            }
            
            return mn - 1;
        }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k,w;
        cin>>n>>k>>w;
        vector <int> a(n);
        for(auto &j:a)
            cin>>j;
        Solution s;
        cout<<s.maximizeMinHeight(n,k,w,a)<<endl;
    }
    return 0;
}
// } Driver Code Ends
