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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        findallPartition(n,n,list,result);
        return result;
    }
    //
    public void findallPartition(int n,int m, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        
        if(n==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int k=m;k>0;k--){
            if(n-k >= 0){
                list.add(k);
                findallPartition(n-k,k,list,result);
                list.remove(list.size()-1);
            }
        }
    }
}