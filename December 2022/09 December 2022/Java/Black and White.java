//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends

class BlackAndWhite
{
    public static long numOfWays(int n, int m) 
    {
        int x_off[] = new int[]{-2, -2, -1, 1, 2, 2, 1, -1};
        int y_off[] = new int[]{-1, 1, 2, 2, 1, -1, -2, -2};
        final long MOD = 1000000007;

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