//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
   public:
    int longestPerfectPiece(int arr[], int n) {
        map<int,int> mp;
        int ans=1;
        int l=0;
        for(int r=0;r<n;r++){
            mp[arr[r]]++;
            //cout<<mp.rbegin()->first<<" "<<mp.begin()->first<<endl;
            while(mp.rbegin()->first-mp.begin()->first>1){
                mp[arr[l]]--;
                if(mp[arr[l]]==0){
                    mp.erase(arr[l]);
                }
                l++;
            }
            
            ans=max(ans,r-l+1);
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
        
        cin>>N;
        int arr[N];
        for(int i=0; i<N; i++)
            cin>>arr[i];

        Solution ob;
        cout << ob.longestPerfectPiece(arr,N) << endl;
    }
    return 0;
}
// } Driver Code Ends