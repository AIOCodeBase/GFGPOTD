//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
		int characterReplacement(string s, int k){
		    int mx = 1;
		    for(char ch='A'; ch<='Z';ch++){
		        int c=0;
		        int right=0;int left =0;
		        while(right<s.size())
		        {
		            if(s[right]==ch){
		                mx=max(mx,right-left+1);
		                right++;
		            }
		            else{
		                if(c<k){
		                    c++;
		                    mx=max(mx,right -left+1);
		                    right++;
		                }
		                else{
		                    while(left<s.size()&&s[left]==ch){
		                        left++;
		                    }
		                    left++;c--;
		                }
		            }
		        }
		    }
		    return mx;// Code here
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string s;
		cin >> s;
		int k;
		cin >> k;
		Solution obj;
		int ans = obj.characterReplacement(s, k);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends