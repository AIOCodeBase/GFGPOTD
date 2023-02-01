//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            int[] ptr = ob.satisfyEqn(A,N);
            
            System.out.println(ptr[0] + " " + ptr[1] + " " + ptr[2] + " " + ptr[3]);
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution {
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        int ans[]=new int[4];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                for(int k=0;k<N;k++)
                {
                    for(int l=0;l<N;l++)
                    {
                        if(A[i]+A[j]==A[k]+A[l] && i!=j && k!=l && j!=k && i!=k && j!=l && i
                        !=l)
                        {
                            ans[0]=i;ans[1]=j;ans[2]=k;ans[3]=l;
                            return ans;
                        }
                    }
                }
            }
        }
        ans[0]=-1;ans[1]=-1;ans[2]=-1;ans[3]=-1;
        return ans;
    }
};