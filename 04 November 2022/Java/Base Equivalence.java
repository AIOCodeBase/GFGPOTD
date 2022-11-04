//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int m = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.baseEquiv(n,m));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here
        if(m==1 && n<32) return "Yes";
        int cnt=0;
        int x=1;
        while(n/x>0){
            x*=2;
            cnt++;
        }
        if(m==cnt) return "Yes";
        else if(m>cnt)return "No";

        for(int i=3; i<=32; i++){
            cnt=0; x=1;
            while(n/x>0){
                x*=i;
                cnt++;
                if(cnt>m) break;
            }
            if(cnt==m) return "Yes";
        }
        return "No";
    }
}