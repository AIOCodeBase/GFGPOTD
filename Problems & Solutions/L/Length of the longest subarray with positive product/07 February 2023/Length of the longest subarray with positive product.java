//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution{
    int maxLength(int arr[], int n) { 
    int pos = 0;

    int neg = 0;

    int res = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            pos=neg=0;
        }

        else if (arr[i] > 0)
        {
            pos+=1;
            if(neg!=0)
            neg+=1;

            res = Math.max(res, pos);
        } 

        else
        {
            int t =pos; pos=neg; neg=t;
            neg+=1;
            if(pos!=0)
            {
                pos+=1;
            }
             res = Math.max(res, pos);
        }

    }

    return res;
    }

}
