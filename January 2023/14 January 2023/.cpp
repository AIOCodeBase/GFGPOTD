
//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
public:

  vector<int> maximumToys(int N,vector<int> A,int Q,vector<vector<int>> Queries){
      // code here
      vector<int> sol;
      vector<long long int> vec(N,0);
      vector<pair<int,int>> B;
      for(int i=0;i<N;i++){
          B.push_back({A[i],i});
      }
      unordered_map<int,int> mp;
      sort(B.begin(),B.end());
      long long int s = 0;
      for(int i=0;i<N;i++) {
          s+=B[i].first;
          vec[i]=s;
          mp[B[i].second] = i;
      }

      int q = 0;

      while(q<Q){

          int ans =0;
          long long req = Queries[q][0];

          vector<int> Querie;

          for(int i=0;i<Queries[q][1];i++) {
              Querie.push_back(mp[Queries[q][2+i]-1]);
          }

          sort(Querie.begin(),Querie.end());
          int c =0;
          while(c<Queries[q][1]) {
             auto v = upper_bound(vec.begin(), vec.end(),req)-vec.begin();
             if( v-1 >= Querie[c]) {
                 req+=B[Querie[c]].first;
                 ans++;
             }
             c++;
          }

        auto v = upper_bound(vec.begin(), vec.end(),req)-vec.begin();
          sol.push_back(v-ans);
          q++;
      }
      return sol;
  }
};
int main() {
 int t=1;
 cin>>t;
 for(int i=1;i<=t;i++){
    int N;
    cin>>N;
    vector<int>A(N);
    for(auto &i:A){
      cin>>i;
    }
      }
    int Q;
    cin>>Q;
    vector<vector<int>> Queries(Q);
    for(int i=0;i<Q;i++){
      int x,y;
      cin>>x>>y;
      Queries[i].push_back(x);
      Queries[i].push_back(y);
      for(int j=0;j<Queries[i][1];j++){
        cin>>x;
        Queries[i].push_back(x);
      }
    }
    Solution obj;
    auto ans =obj.maximumToys(N,A,Q,Queries);
    for(auto i:ans)
      cout<<i<<" ";
    cout<<endl;
 }
}
