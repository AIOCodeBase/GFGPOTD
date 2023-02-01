//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
string buildLowestNumber(string num, int k);
// Driver program to test above function
int main()
{
    int t,n;
    string str;
    cin>>t;
    while(t--)
    {
    cin>>n;
    cin>>str;
    cout << buildLowestNumber(str, n)<<endl;
    }
    return 0;
}

// } Driver Code Ends


string buildLowestNumber(string num, int k) 
{
    int n = num.size();
    stack<char> mystack;
    for(char c: num)
    {
        while(!mystack.empty() && k>0 && mystack.top()>c)
        {   mystack.pop();      k-=1;   }
        
        if(!mystack.empty() || c!='0')
            mystack.push(c);
    }
    
    while(!mystack.empty() && k--)
        mystack.pop();
    if(mystack.empty())
        return "0";
    
    while(!mystack.empty())
    {
        num[n-1] = mystack.top();
        mystack.pop();
        n-=1;
    }
    return num.substr(n);
}