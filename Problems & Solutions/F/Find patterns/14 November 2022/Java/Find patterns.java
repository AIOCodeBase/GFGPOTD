//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        int n=0,k=0,ans=0;
        char arr[]=new char[W.length()];
        for(int i=0;i<W.length();i++){
            arr[i]=W.charAt(i);
        }
        boolean f[]=new boolean[S.length()];
        for(int i=0;i<S.length();i++){
            if(f[i]==true)
            continue;
            if(f[i]==false && S.charAt(i)==arr[k]){
                k++;
                f[i]=true;
            }
            if(k==arr.length){
                i=0;
                k=0;
                ans++;
            }
        }
        return ans;
    }
}