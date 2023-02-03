//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends

class Solution{
    static boolean issafe(int m, int n, int i, int j)
    {
     
      if (i < 0)
        return false;
      if (j < 0)
        return false;
      if (i >= m)
        return false;
      if (j >= n)
        return false;
     
      return true;
    }
     
    static int [] endPoints(int [][]arr, int m, int n){
     
      int i = 0;
      int j = 0;
      int current_i = 0;
      int current_j = 0;
     
      char current_d = 'r';
     
      Map<Character,Character> rcd = new HashMap<>();
      rcd.put('l', 'u');
      rcd.put('u', 'r');
      rcd.put('r', 'd');
      rcd.put('d', 'l');
     
      while (issafe(m, n, i, j)){
     
        current_i = i;
        current_j = j;
     
        if (arr[i][j] == 1){
     
          char move_in = rcd.get(current_d);
     
          arr[i][j] = 0;
     
          if (move_in == 'u')
            i -= 1;
          else if(move_in == 'd')
            i += 1;
          else if(move_in == 'l')
            j -= 1;
          else if(move_in == 'r')
            j += 1;
     
          current_d = move_in;
     
        }
     
        else{
          if (current_d == 'u')
            i -= 1;
          else if(current_d == 'd')
            i += 1;
          else if(current_d == 'l')
            j -= 1;
          else if(current_d == 'r')
            j += 1;
        }
      }
     
      return new int[]{current_i, current_j};
     
    }
}
