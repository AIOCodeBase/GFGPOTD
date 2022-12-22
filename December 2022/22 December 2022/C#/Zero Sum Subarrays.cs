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

                int n = Convert.ToInt32(Console.ReadLine());
                long[] arr = new long[n];
                var ip = Console.ReadLine().Trim().Split(' ');
                for (int i = 0; i < n; i++)
                {
                    arr[i] = long.Parse(ip[i]);
                }
                Solution obj = new Solution();
                var res = obj.findSubarray(arr, n);
                Console.WriteLine(res);
            }

        }
    }
}
// } Driver Code Ends

class Solution
{
    public long findSubarray(long[] arr, int n)
    {
        long sum = 0, counter = 0;

        Dictionary<long, long> mp = new Dictionary<long, long>();

        for (int i = 0; i < n; i++)
        {
            sum += arr[i];

            if (sum == 0)
            {
                counter++;
            }

            if (mp.ContainsKey(sum))
            {
                counter += mp[sum];
                mp[sum]++;
            } else {
                mp[sum] = 1;
            }

        }
        return counter;
    }

}