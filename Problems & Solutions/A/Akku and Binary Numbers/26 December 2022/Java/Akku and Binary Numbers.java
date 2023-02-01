//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        ob.precompute();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long R = Long.parseLong(input_line[1]);
            long ans = ob.solve(L, R);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends

class Solution{
    ArrayList<Long> arr=new ArrayList<>();
    void precompute(){
        for(int i=0;i<63;i++){
            for(int j=i+1;j<63;j++){
                for(int k=j+1;k<63;k++){
                    arr.add((long)Math.pow(2,i)+(long)Math.pow(2,j)+(long)Math.pow(2,k));
                }
            }
        }
        Collections.sort(arr);
    }
    long solve(long L, long R){
        int l=0,r=arr.size()-1;
        while(l<r)
        {
            int mid=(l+r+1)/2;
            if(arr.get(mid)>R){
                r=mid-1;
            }else{
                l=mid;
            }
        }
        int l1=0,r1=arr.size()-1;
        while(l1<r1){
            int mid=(l1+r1+1)/2;
            if(arr.get(mid)>L-1){
                r1=mid-1;
            }else{
                l1=mid;
            }
        }
        if(arr.get(l1)>=L){
            l1--;
        }
        return l-l1;
    }
    
}
