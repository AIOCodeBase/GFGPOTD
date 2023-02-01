//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
	vector<vector<int>>ans;
    bool fun(int target,vector<int>&candidates,vector<int>res,int pos){
        if(target==0){
        	sort(res.begin(), res.end());
        	reverse(res.begin(), res.end());
            ans.push_back(res);
            return true;
        }
        if(target<0)
            return false;
        bool f=false;
        for(int i=pos;i<candidates.size();i++){
            res.push_back(candidates[i]);
            f=fun(target-candidates[i],candidates,res,i);
            res.pop_back();
        }
        return f;
    }    
    vector<vector<int>> UniquePartitions(int n) {
    	vector<int>cur, nums;
    	for(int i = 1; i <= n; i++)
    		nums.push_back(i);
    	fun(n, nums, cur, 0);
    	sort(ans.begin(), ans.end());
    	reverse(ans.begin(), ans.end());
    	return ans;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		vector<vector<int>> ans = ob.UniquePartitions(n);
    	for(auto i : ans)
    		for(auto j: i)
    			cout << j <<" ";
    	cout << "\n";
	}  
	return 0;
}
// } Driver Code Ends