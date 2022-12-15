//{ Driver Code Starts
// Initial template for c++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    string BalancedString(int N) {
        string ans = "", full = "";
        for (char ch = 'a'; ch <= 'z'; ch++) full += ch;
        int a = N / 26, b = N % 26, i;
        while (a--)
            ans += full;
        if (N % 2 == 0) {
            for (i = 0; i < b / 2; i++) ans += (char)('a' + i);
            for (i = 26 - b / 2; i < 26; i++) ans += (char)('a' + i);
        }
        else {
            int SumOfdigits = 0, temp = N;
            while (temp) {
                SumOfdigits += temp % 10;
                temp /= 10;
            }
            if (SumOfdigits % 2 == 0) {
                for (i = 0; i < (b + 1) / 2; i++) ans += (char)('a' + i);
                for (i = 26 - b / 2; i < 26; i++) ans += (char)('a' + i);
            }
            else {
                for (i = 0; i < b / 2; i++) ans += (char)('a' + i);
                for (i = 26 - (b + 1) / 2; i < 26; i++) ans += (char)('a' + i);
            }
        }
        return ans;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.BalancedString(N) << endl;
    }
    return 0;
}

// } Driver Code Ends