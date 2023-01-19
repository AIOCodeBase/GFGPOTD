//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    int find(int a,int b)
    {
        int ans=0;
        while(a>b)
        {
            ans++;
            a=(a/2);
        }
        return ans;
    }
    
    int carpetBox(int A, int B, int C, int D) { 
        
        return Math.min(find(A,C)+find(B,D),find(A,D)+find(B,C));
    }
   
}
