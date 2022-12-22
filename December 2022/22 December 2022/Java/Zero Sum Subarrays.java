//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends

class Solution{
    public static long findSubarray(long[] arr ,long n) 
{
     long sum=0, counter=0; 
     HashMap<Long, Long>mp=new HashMap<>();
    
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
            if(sum==0)
            {
                counter++;
            }
            
            if(mp.containsKey(sum)) 
            {
               counter+=mp.get(sum);
            }
            
            if(mp.containsKey(sum))
            {
                long k=mp.get(sum);
                k++;
                mp.put(sum,k);
                
            }
            else
             mp.put(sum,1L);
        }
       
       return counter ;
}
}