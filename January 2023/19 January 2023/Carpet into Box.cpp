//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

//User function Template for C++

class Solution{
    public:
    int carpetBox(int A, int B, int C, int D){
        if(max(A,B)<max(C,D) && min(A,B)<min(C,D)){
            return 0;
        }
        else{
            int count =0;
            while(max(A,B)>max(C,D)){
                count++;
                if(A>B){
                    A=floor(A/2);
                }
                else{
                    B=floor(B/2);
                }
            }
            while(min(A,B)>min(C,D)){
                count++;
                if(A>B){
                    B=floor(B/2);
                }
                else{
                    A=floor(A/2);
                }
            }
            return count;
        }
    }
};

//{ Driver Code Starts.


int main(){
    int t;
    cin>>t;
    while(t--){
        int A,B,C,D;
        cin>>A>>B>>C>>D;

        Solution ob;

        int ans = ob.carpetBox(A,B,C,D);

        cout<<ans<<endl;
    }
}
// } Driver Code Ends
