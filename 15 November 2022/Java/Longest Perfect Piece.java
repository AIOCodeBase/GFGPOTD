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
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        int left=0;
        int first=-1,second=-1;
        int fc=0,sc=0;
        int len=0;
        for(int i=0;i<N;i++){
            if(first==-1 || arr[i]==first) {
                first=arr[i];
                fc=i;
            } else if(second==-1 || second==arr[i]) {
                if(second == -1 && Math.abs(arr[i]-first)>1){
                    first=arr[i];
                    fc=i;
                    left=i;
                } else{
                    second=arr[i];    
                    sc=i;
                }
            } else {
                left=fc+1;
                first=second;
                fc=sc;
                i--;
                second=-1;
                sc=0;
            }
            len=Math.max(len,i-left+1);
        }
        return len;
    }
};