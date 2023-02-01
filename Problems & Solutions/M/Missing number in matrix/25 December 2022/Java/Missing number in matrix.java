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
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            long ans = ob.MissingNo(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution
{
    public long  MissingNo(int[][] matrix)
    {
        TreeSet<Long>nonzero=new TreeSet<>(), zero=new TreeSet<>();
    	
    	for(int i = 0; i < matrix.length; i++){
    		boolean f = true;
    		long sum = 0;
    		for(int j = 0; j < matrix[0].length; j++){
    			sum += matrix[i][j];
    			if(matrix[i][j]==0)
    				f = false;
    		}
    		if(f)nonzero.add(sum);
    		if(!f)zero.add(sum);
    	}
    	for(int  j = 0; j < matrix[0].length; j++){
    		boolean f = true;
    		long sum = 0;
    		for(int i = 0; i < matrix.length; i++){
    			sum += matrix[i][j];
    			if(matrix[i][j]==0)
    				f = false;
    		}
    		if(f)nonzero.add(sum);
    		if(!f)zero.add(sum);
    	}
    	boolean f = true;
    	long sum = 0;
    	for(int i = 0; i < matrix.length; i++){
    		sum += matrix[i][i];
    		if(matrix[i][i]==0)
    			f = false;
    	}
    	if(f)nonzero.add(sum);
		if(!f)zero.add(sum);
    	f = true;
    	sum = 0;
    	for(int i = 0, j = matrix.length - 1; j >= 0; i++,j--){
    		sum += matrix[i][j];
    		if(matrix[i][j]==0)
    			f = false;
    	}
		if(f)nonzero.add(sum);
		if(!f)zero.add(sum);
    	if(nonzero.size() == 1 && zero.size() == 1){
    		long x = nonzero.first();
    		long y = zero.first();
    		if(x <= y)
    			return -1;
    		return x - y;
    	}
    	return -1;
    }
}
