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


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
         String A1 = A;
        int reps = 1;
        boolean checked = false;
        for(int i = 0;i<A.length();i++){
            
            if (B.substring(0,A.length()-i).equals(A.substring(i,A.length()))){
            while (A.length()-i<B.length()){
                A+=A1;
                reps+=1;
            }
            if(A.substring(i,i+B.length()).equals(B)){
                
                return reps;
            }else{
                
                return -1;
            }
            }
        }
        
               
        return -1;
    
    }
};
