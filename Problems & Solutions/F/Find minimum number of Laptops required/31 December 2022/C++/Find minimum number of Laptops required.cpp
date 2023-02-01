//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int minLaptops(int N, int start[], int end[]) {
        map<int,int>mp;
        for(int i=0; i<N; i++)
        {
            mp[start[i]] += 1;
            mp[end[i]] -= 1;
        }
        vector<pair<int,int>> s;
        for(auto it: mp)
            s.push_back(it);
        sort(s.begin(), s.end());
        int c=0,ans=0;
        for(pair<int,int> i:s)
        {
            c+=i.second;
            ans=max(ans,c);
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        int start[N], end[N];
        for(int i=0; i<N; i++)
            cin>>start[i];
        for(int i=0; i<N; i++)
            cin>>end[i];
            
        Solution ob;
        cout << ob.minLaptops(N, start, end) << endl;
    }
}
// } Driver Code Ends