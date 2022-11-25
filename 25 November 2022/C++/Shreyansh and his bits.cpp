//{ Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;


// } Driver Code Ends
//User function Template for C++

const int kN = 40;
long long cache[kN][kN];
class Solution{
public:
    
    long long ncr(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
        if (cache[n][r] != -1) {
            return cache[n][r];
        }
        
        auto res = ncr(n-1, r-1) + ncr(n-1, r);
        return (cache[n][r] = res);
    }
    long long count(long long x) {
        for (int i = 0; i < kN; i++) {
            for (int j = 0; j < kN; j++) {
                cache[i][j] = -1;
            }
        }
        long long res = 0;
        int ones = 0;
        int bits = 0;
        while (x != 0) {
            if (x&1) {
                res += ncr(bits, ++ones);
            }
            bits++;
            x >>= 1;
        }
        return res;
    }
};

//{ Driver Code Starts.

int main() {
    
	int t;
	cin >> t;
	while (t-- > 0) {
	    long long x; cin >> x;
	    Solution ob;
	    cout << ob.count(x) << '\n';
	}
	return 0;
}
// } Driver Code Ends