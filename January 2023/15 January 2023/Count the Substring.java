//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    } 

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            String S = sc.next();
            Solution ob = new Solution();
            long ans = ob.countSubstring(S);
            out.println(ans);
        }
        out.flush();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    // Counts the number of substrings in the given string 'S' 
    // that have equal number of zeroes and ones
    long countSubstring(String S){
        long count = 0, numOfZeroes = 0;
        int zeroIndex = S.length();
        int frequency[] = new int[2 * S.length() + 5];
        int currentCount=zeroIndex;
        // Iterate through the string and update the count of zeroes and ones
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '0')
                currentCount--;
            else
                currentCount++;

            if(currentCount <= zeroIndex){
                numOfZeroes++;
            }
            frequency[currentCount]++;
        }

        // Iterate through the string again and update the count of substrings
        for(int i = 0; i < S.length(); i++){
            count += (S.length() - i - numOfZeroes) * 1l;

            if(S.charAt(i) == '1'){
                frequency[zeroIndex+1]--;
                zeroIndex++;
                numOfZeroes += frequency[zeroIndex];
            }
            else{
                frequency[zeroIndex-1]--;
                zeroIndex--;
                numOfZeroes--;
                numOfZeroes -= frequency[zeroIndex+1];
            }
        }

        return count;
    }
}
