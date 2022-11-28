//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
	vector<int> findSubarray(int a[], int n) {
	    long long max_sum = -1;
	    long long cur_sum = 0;
	    int max_range_left = -1;
	    int max_range_right = -1;
	    int cur_range_left = 0;
	    int cur_range_right = 0;
	    while (cur_range_right < n) {
	        if (a[cur_range_right] < 0) {
	            cur_range_left = cur_range_right + 1;
	            cur_sum = 0;
	        } else {
	            cur_sum += (long long)a[cur_range_right];
	            if (cur_sum > max_sum) {
	                max_sum = cur_sum;
	                max_range_left = cur_range_left;
	                max_range_right = cur_range_right;
	            } else if (cur_sum == max_sum) {
	                if (cur_range_right + 1 - cur_range_left >
	                    max_range_right + 1 - max_range_left) {
	                    max_range_left = cur_range_left;
	                    max_range_right = cur_range_right;
	                }
	            }
	        }
	        cur_range_right++;
	    }
	    vector<int> ans;
	    if (max_range_left == -1 || max_range_right == -1) {
	        ans.push_back(-1);
	        return ans;
	    }

	    for (int i = max_range_left; i <= max_range_right; ++i) ans.push_back(a[i]);
	    return ans;
	}
};

//{ Driver Code Starts.

void printAns(vector<int> &ans) {
    for (auto &x : ans) {
        cout << x << " ";
    }
    cout << "\n";
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        int a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.findSubarray(a, n);
        printAns(ans);
    }
    return 0;
}

// } Driver Code Ends