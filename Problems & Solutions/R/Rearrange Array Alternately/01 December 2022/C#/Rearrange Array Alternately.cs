//{ Driver Code Starts
//Initial Template for C#

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DriverCode
{

    class GFG
    {
        static void Main(string[] args)
        {
            int testcases;// Taking testcase as input
            testcases = Convert.ToInt32(Console.ReadLine());
            while (testcases-- > 0)// Looping through all testcases
            {
                
                int n = Convert.ToInt32(Console.ReadLine());// Input for size of array
                long[] arr = new long[n];
                string elements = Console.ReadLine().Trim();
                elements = elements + " " + "0";
                long[] arr1 = Array.ConvertAll(elements.Split(), long.Parse);
                for (int i = 0; i < n; i++)
                {
                    arr[i] = arr1[i];
                }
                Solution obj = new Solution();
                obj.rearrange(arr,n);
                foreach (int i in arr)
                {
                    Console.Write(i + " ");
                }
                Console.WriteLine();
            }

        }
    }

    
// } Driver Code Ends
//User function Template for C#

 class Solution
{
     
    public void rearrange(long[] arr, int n) 
    {
        int max_idx = n-1,min_idx = 0;
        long C = arr[n-1] + 1;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                arr[i] += (arr[max_idx]%C) * C;
                max_idx--;
            } else {
                arr[i] += (arr[min_idx]%C) * C;
                min_idx++;
            }
        }
        
        for(int i = 0;i<n;i++){
            arr[i] = arr[i]/C;
        }
    }

}



//{ Driver Code Starts.
}
// } Driver Code Ends