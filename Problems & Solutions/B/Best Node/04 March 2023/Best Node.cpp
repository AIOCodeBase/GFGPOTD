//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


class Array
{
public:
    template <class T>
    static void input(vector<T> &A,int n)
    {
        for (int i = 0; i < n; i++)
        {
            scanf("%d ",&A[i]);
        }
    }

    template <class T>
    static void print(vector<T> &A)
    {
        for (int i = 0; i < A.size(); i++)
        {
            cout << A[i] << " ";
        }
        cout << endl;
    }
};


// } Driver Code Ends
class Solution {
  public:
    long long bestNode(int N, vector<int> &A, vector<int> &P) {
        
        set<int> st{P.begin(), P.end()};
        vector<int> leafNode;
        for (int i=1; i<=N; i++){
            if (!st.count(i)) leafNode.push_back(i);
        }
        long long ans = INT_MIN;
        for (auto node:leafNode){
            long long temp = 0;
            while(node != -1){
                temp *= -1;
                temp += A[node-1];
                node = P[node-1];
                ans = max(ans, temp);
            }
        }
        return ans;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int N;
        scanf("%d",&N);
        
        
        vector<int> A(N);
        Array::input(A,N);
        
        
        vector<int> P(N);
        Array::input(P,N);
        
        Solution obj;
        long long res = obj.bestNode(N, A, P);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends
