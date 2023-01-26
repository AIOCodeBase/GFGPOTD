//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
    string caseSort(string str, int n)
    {
        
        string v = str;
        sort(v.begin(), v.end());
        string ans;
        int big_index = -1;
        
        while(v[++big_index] < 97);
        
        for(int i = 0, small_index = 0; i < n; i++){
            
            ans += str[i] >= 97 ? v[big_index++] : v[small_index++]; 
        }
            
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
		int n;
		cin>>n;
		string str;
		cin>>str;
		Solution obj;
		cout<<obj.caseSort (str, n)<<endl;
	}
}
// } Driver Code Ends
