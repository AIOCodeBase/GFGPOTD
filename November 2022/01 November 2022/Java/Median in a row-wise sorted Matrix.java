//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {

    int nums[] = new int[R*C];

    int k = 0;

    for(int i = 0; i < matrix.length; i++){

        for(int j = 0; j< matrix[0].length; j++){

            nums[k++] = matrix[i][j];

        }

    }

    

    Arrays.sort(nums);

    int m = nums.length;

     if (m % 2 != 0)

            return nums[m / 2];

 

        return (nums[(m - 1) / 2] + nums[m/ 2]) / 2;

    

    }
}