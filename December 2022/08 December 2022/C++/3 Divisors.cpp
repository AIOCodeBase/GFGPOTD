//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

bool primeNum[1000001];

vector<int> primeArray;

void sieveOfEratosthenes(int N) {
    for (int i=2; i*i<=N; i++) {

        if (primeNum[i]) {
            for (int j=i*i; j<=N; j=j+i) {
                primeNum[j] = 0;
            }
        }
    }

    for (int i=2; i<=N; i++) {

        if (primeNum[i]) {
            primeArray.push_back(i);
        }
    }

}
int solve(long long n) {
    int counter=0;

    int index = 0;
    long long int currentNum = primeArray[index] * primeArray[index];

    while (currentNum <= n) {
        counter++;
        index++;

        if (index==primeArray.size()) {
            break;
        }

        currentNum = (long long)primeArray[index] * (long long)primeArray[index];
    }
    return counter;
}
class Solution
{
public:
    vector<int> threeDivisors(vector<long long> query, int q)
    {
        memset(primeNum, 1, sizeof(primeNum));

        sieveOfEratosthenes(1000000);
        vector<int> ans;
        for (auto n : query) {
            ans.push_back(solve(n));
        }

        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while(t--){
        int q;cin>>q;
        vector<long long> query(q);
        for(int i=0;i<q;i++){
            cin>>query[i];
        }
        Solution ob;
            
        vector<int> ans = ob.threeDivisors(query,q);
        for(auto cnt : ans) {
            cout<< cnt << endl;
        }
    }
    return 0;
}
// } Driver Code Ends