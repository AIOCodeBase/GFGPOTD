//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:
	string addBinary(string A, string B) {
		int i = A.length(), j = B.length();

		if (i == 0) return B;
		if (j == 0) return A;

		i--;
		j--;

		string res = "";
		char ch1, ch2, carry = '0';
		int temp;


		while (i >= 0 || j >= 0) {
			if (i >= 0) ch1 = A[i];
			else ch1 = '0';

			if (j >= 0) ch2 = B[j];
			else ch2 = '0';

			temp = ( (ch1 - '0') + (ch2 - '0') + (carry - '0') );
			if (temp == 0) {
				res += '0';
				carry = '0';
			}

			else if (temp == 1) {
				res += '1';
				carry = '0';
			}

			else if (temp == 2) {
				res += '0';
				carry = '1';
			}

			else {
				res += '1';
				carry = '1';
			}

			i--; j--;
		}

		if (carry == '1') res += carry;

		int len = res.length();
		while (len > 0 and res[len - 1] == '0') len--;

		if (len == 0) return "0";

		for (int i = 0; i < len / 2; i++) swap (res[i], res[len - i - 1]);
		return res.substr (0, len);
	}

};

//{ Driver Code Starts.

int main()
{
	int t; cin >> t;
	while (t--)
	{
		string A, B; cin >> A >> B;
		Solution ob;
		cout << ob.addBinary (A, B);
		cout << "\n";
	}
}

// Contributed By: Pranay Bansal

// } Driver Code Ends