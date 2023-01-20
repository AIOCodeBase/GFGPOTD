//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

//User function Template for C++
class Solution
{
  public:
  int maxWeightCell(int N, vector<int> Edge)
  {
     vector<int>ans(N,0);
     int max=0;
     for(int i=0;i<N;i++){
        if(Edge[i]>=0){
            ans[Edge[i]]+=i;
            if(ans[Edge[i]]>ans[max] || Edge[i]>max && ans[Edge[i]]==ans[max])max=Edge[i];
        }
     }
     return max;
  }
};

//{ Driver Code Starts.
int main(){
   int tc;
   cin >> tc;
   while(tc--){
      int N;
      cin >> N;
      vector<int> Edge(N);
      for(int i=0;i<N;i++){
        cin>>Edge[i];
      }
      Solution obj;
      int ans=obj.maxWeightCell(N, Edge);
      cout<<ans<<endl;
   }
   return 0;
}
// } Driver Code Ends
