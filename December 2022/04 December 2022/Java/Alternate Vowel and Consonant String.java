//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String S, int N){
        HashSet<Character> st=new HashSet<>();
    	// vowels
    	st.add ('a');
    	st.add ('e');
    	st.add ('i');
    	st.add ('o');
    	st.add ('u');
    
    	int vow[] = new int[26], cons[] = new int[26];
    	
    	int numVow = 0, numCons = 0;
    	char smallestVow = 'u', smallestCons = 'z';
    	for (int i = 0; i < N; ++i)
    	{
    		if (S.charAt(i) < 'a' || S.charAt(i) > 'z')
    			return "-1";
        
    		if (!st.contains(S.charAt(i)))
    		{
    			cons[S.charAt(i) - 'a']++;
    			numCons++;
    			if (S.charAt(i) < smallestCons)
    				smallestCons = S.charAt(i);
    		}
    		// else if it's a vowel
    		else
    		{
    			vow[S.charAt(i) - 'a']++;
    			numVow++;
    			if (S.charAt(i) < smallestVow)
    				smallestVow = S.charAt(i);
    		}
    	}
        
    	if (Math.abs (numVow - numCons) > 1)
    		return "-1";
        
    	boolean putVow;
    	
    	if (numVow == numCons)
    	{
    		if (smallestVow < smallestCons)
    			putVow = true;
    		else
    			putVow = false;
    	}
    	else if (numVow > numCons)
    		putVow = true;
    	else
    		putVow = false;
    
    
    	int i = 0, j = 0, itr = 0;
    	
    	char ch[]=new char[N];
    	while (i < 26 || j < 26)
    	{
    		if (putVow)
    		{
    			while (i < 26 && vow[i] == 0) i++;
    			if (i == 26)
    				break;
    			ch[itr++] = (char)('a' + i);
    			vow[i]--;
    			putVow = false;
    		}
    		else
    		{
    			while (j < 26 && cons[j] == 0) j++;
    			if (j == 26)
    				break;
    			ch[itr++] = (char)('a' + j);
    			cons[j]--;
    			putVow = true;
    		}
    	}
    	StringBuilder sb=new StringBuilder();
    	for(char chr:ch){
    	    sb.append(chr);
    	}
    	return sb.toString();
    }
}
