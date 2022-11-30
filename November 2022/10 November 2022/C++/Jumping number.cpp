//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution {
  public:
    long long jumpingNums(long long X) {
      if (X <= 9)
        return X;
      queue < int > q;
      //push 1 to 9
      for (int i = 0; i <= 9; i++) {
        q.push(i);
      }
      int ans = INT_MIN;
      while (q.size() > 0) {
        int digit = q.front();
        q.pop();
        //update
        ans = max(ans, digit);
        int rem = digit % 10;
        int num1 = digit * 10 + rem - 1;
        int num2 = digit * 10 + rem + 1;
        //special case
        if (rem == 0) {
          if (num2 <= X)
            q.push(num2);
        } else if (rem == 9) {
          if (num1 <= X)
            q.push(num1);
        } else {
          if (num1 <= X) {
            q.push(num1);
          }

          if (num2 <= X) {
            q.push(num2);
          }

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
    long long X;

    cin >> X;

    Solution ob;
    cout << ob.jumpingNums(X) << endl;
  }
  return 0;
}
// } Driver Code Ends
