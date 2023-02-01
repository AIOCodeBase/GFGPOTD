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

                var ip = Console.ReadLine().Trim().Split(' ');
                int n = int.Parse(ip[0]);
                int m = int.Parse(ip[1]);
                List<List<int>> grid = new List<List<int>>();
                for (int i = 0; i < n; i++)
                {
                    grid.Add(new List<int>());
                }
                for (int i = 0; i < n; i++)
                {
                    ip = Console.ReadLine().Trim().Split(' ');
                    for (int j = 0; j < m; j++)
                    {
                        grid[i].Add(int.Parse(ip[j]));
                    }
                }
                Solution obj = new Solution();
                var res = obj.nearest(ref grid);
                foreach (var row in res)
                {
                    foreach (var c in row)
                    {
                        Console.Write(c + " ");
                    }
                    Console.WriteLine();
                }
                

            }

        }
    }
}
// } Driver Code Ends

class Solution
{

    bool isValid(int x, int y, int n, int m)
    {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public List<List<int>> nearest(ref List<List<int>> grid)
    {
        int n = grid.Count;
        int m = grid[0].Count;
        List<int> dx = new List<int>() { 1, -1, 0, 0 };
        List<int> dy = new List<int>() { 0, 0, 1, -1 };
        Queue<List<int>> q = new Queue<List<int>>();

        List<List<int>> dp = new List<List<int>>();
        for (int i = 0; i < n; i++)
        {
            dp.Add(new List<int>());
            for (int j = 0; j < m; j++)
            {
                dp[i].Add(int.MaxValue);
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 1)
                {
                    dp[i][j] = 0;
                    q.Enqueue(new List<int>() { i, j });
                }
            }
        }

        while (q.Count > 0)
        {
            int x = q.Peek()[0];
            int y = q.Peek()[1];
            q.Dequeue();

            for (int i = 0; i < 4; i++)
            {
                int n_x = x + dx[i];
                int n_y = y + dy[i];
                if (isValid(n_x, n_y, n, m) && dp[n_x][n_y] > dp[x][y] + 1)
                {
                    dp[n_x][n_y] = dp[x][y] + 1;
                    q.Enqueue(new List<int>() { n_x, n_y });
                }
            }
        }
        return dp;
    }
}