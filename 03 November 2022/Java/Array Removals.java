//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
       int ans = n-1;
       for(int i=0;i<=n-1;i++)
       {
           int index = binarySrc(arr,i,n-1,arr[i]+k);
           ans = Math.min(n-(index-i+1),ans);
       }
       return ans;
       
   }
   int binarySrc(int arr[],int low,int high,int val)
   {
       
       int ans=0;
       while(low<=high)
       {
           int mid = (low+high)/2;
           
           if(arr[mid]==val)
               return mid;
           else if(arr[mid]>val)
           {
               high=mid-1;
               //ans = mid;
           }
           else
           {
               low=mid+1;
               ans = mid;
           }
       }
       return ans;
    }
}