//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
  public:
  
  long long largestcycle=-1;
  
  void DFS(int node,vector<int>& Edge,bool visited[],bool pathvisited[])
  {
      visited[node]=true;
      pathvisited[node]=true;
      
      if(Edge[node]!=-1)
      {
          int adj=Edge[node];
          if(!visited[adj])
          {
              DFS(adj,Edge,visited,pathvisited);
          }
          else if(pathvisited[adj])
          {
              int curr=adj;
              long long sum=0;
              do
              {
                  sum+=curr;
                  curr=Edge[curr];
              }while(curr!=adj);
              largestcycle=max(largestcycle,sum);
          }
      }
      
      pathvisited[node]=false;
  }
  
  long long largestSumCycle(int N, vector<int> Edge)
  {
    // code here
    bool visited[N]={0};
      bool pathvisited[N]={0};
      for(int i=0;i<N;i++)
      {
          if(!visited[i])
          {
              DFS(i,Edge,visited,pathvisited);
          }
      }
      return largestcycle;
  }
};

//{ Driver Code Starts.
signed main(){
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
      long long ans=obj.largestSumCycle(N, Edge);
      cout<<ans<<endl;
   }
   return 0;
}
// } Driver Code Ends
