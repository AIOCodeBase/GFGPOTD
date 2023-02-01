//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        int [] res = new int[2];
        int sum = 0;
        for(int ele : arr){
            sum = sum^ele;
        }
        int c = sum & ~(sum - 1);
        int val1 = 0 , val2 = 0;
        for(int x : arr){
            if((x & c) != 0){
                val1 ^= x;
            }
            else{
                val2 ^= x;
            }
        }
        if(val1 > val2){
            res[0] = val1;
            res[1] = val2;
        }
        else{
            res[0] = val2;
            res[1] = val1;
        }
        return res;
    }
}