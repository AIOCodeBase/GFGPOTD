//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
      public:
    vector<int> satisfyEqn(int a[], int n) {
        // code here
        unordered_map<int,pair<int,int>> m;
        vector<int> Ans;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i]+a[j];
                if(m.find(temp)==m.end()){
                    m[temp]=make_pair(i,j);
                }
                else{
                    pair<int,int> pp=m[temp];
                    if(pp.first!=i && pp.first!=j && pp.second!=i && pp.second!=j){
                        vector<int> ans(4);
                        ans[0]=pp.first;
                        ans[1]=pp.second;
                        ans[2]=i;
                        ans[3]=j;
                        if(Ans.size()==0)
                            Ans=ans;
                        else{
                            bool  rep=false;
                            for(int i1=0;i1<Ans.size();i1++){
                                if(Ans[i1]<ans[i1])
                                    break;
                                if(Ans[i1]>ans[i1]){
                                    rep=true;
                                    break;
                                }
                            }
                            if(rep)
                                Ans=ans;
                        }
                    }
                }
            }
        }
        if(Ans.size()==0)
            return vector<int>(4,-1);
        else
            return Ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int A[N];
        
        for(int i=0; i<N; i++)
            cin>>A[i];

        Solution ob;
        vector<int> ptr = ob.satisfyEqn(A,N);
        
        cout<<ptr[0]<<" "<<ptr[1]<<" "<<ptr[2]<<" "<<ptr[3]<<endl;
    }
    return 0;
}
// } Driver Code Ends