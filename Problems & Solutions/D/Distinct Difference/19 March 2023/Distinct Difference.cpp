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
    vector<int> getDistinctDifference(int N, vector<int> &A) {
        set<int> ls,rs;
        vector<int> lft(N), rgt(N);
        for(int i=0;i<N;i++) {
            lft[i] = ls.size();
            ls.insert(A[i]);
        }
        for(int j=N-1;j>=0;j--) {
            rgt[j] = rs.size();
            rs.insert(A[j]);
        }
        vector<int> ans(N);
        for(int i=0;i<N;i++) {
            ans[i] = lft[i]-rgt[i];
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
        
        Solution obj;
        vector<int> res = obj.getDistinctDifference(N, A);
        
        Array::print(res);
        
    }
}

// } Driver Code Ends
