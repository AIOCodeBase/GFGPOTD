//{ Driver Code Starts
//Initial Template for C#

using System;
using System.Numerics;
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
                // int N = Convert.ToInt32(Console.ReadLine());
                int[] arr = new int[2];
                string elements = Console.ReadLine().Trim();
                elements = elements + " " + "0";
                arr = Array.ConvertAll(elements.Split(), int.Parse);
                int N = arr[0];
                int M = arr[1];
                Solution obj = new Solution();
                long res = obj.numOfWays(N, M);
                Console.Write(res+"\n");
          }

        }
    }
}

// } Driver Code Ends



class Solution
    {
        public long numOfWays(int n, int m)
        {
            int[] x_off = new int[]{-2, -2, -1, 1, 2, 2, 1, -1};
            int[] y_off = new int[]{-1, 1, 2, 2, 1, -1, -2, -2};
            long MOD = 1000000007;
    
            long ret = 0;
            int x = 0, y = 0;
    
            for (int i = 0; i < m; ++i)
            {
                for (int j = 0; j < n; ++j) 
                {
                    for (int k = 0; k < 8; ++k)
                    {
                        x = i + x_off[k];
                        y = j + y_off[k];
    
                        if (x >= 0 && x < m && y >= 0 && y < n)
                            ++ret; 
                    }
                }
            }
            long total = m * n;
            total = (total * (total - 1)) % MOD;
            
            return (total + MOD - ret) % MOD;
        }

    }