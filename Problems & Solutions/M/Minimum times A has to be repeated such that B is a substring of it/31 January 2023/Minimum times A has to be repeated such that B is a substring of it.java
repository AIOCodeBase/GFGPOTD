//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    static boolean issubstring(String str2,  
                               String rep1) 
    { 
        int M = str2.length(); 
        int N = rep1.length(); 
      
        for (int i = 0; i <= N - M; i++)  
        { 
            int j; 
      
            for (j = 0; j < M; j++) 
                if (rep1.charAt(i + j) != str2.charAt(j)) 
                    break; 
      
            if (j == M)
                return true; 
        } 
      
        return false;
    } 
    
    static int minRepeats(String A, String B) {
        int ans = 1; 
          
        String S = A; 
          
        while(S.length() < B.length()) 
        { 
            S += A; 
            ans++; 
        } 
          
        if (issubstring(B, S)) return ans; 
          
        if (issubstring(B, S + A))  
            return ans + 1; 
              
        return -1; 
    }
};
