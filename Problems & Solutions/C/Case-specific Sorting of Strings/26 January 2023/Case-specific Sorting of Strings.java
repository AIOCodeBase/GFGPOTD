//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution

{

    public static String caseSort(String str)

    {

        if(str.length()==1) return str;

        int[] cap = new int[26];

        int[] sma = new int[26];

        Arrays.fill(cap,0);

        Arrays.fill(cap,0);

        int z,y;

        for(int i=0;i<str.length();i++){

            z = (int)(str.charAt(i));

            if(z>=65 && z<=90){

                y = z-65;

                cap[y]++;

            }

            else{

                y = z-97;

                sma[y]++;

            }

        }

        ArrayList<Integer> capIndA = new ArrayList<>();

        ArrayList<Integer> smaIndA = new ArrayList<>();

        for(int i=0;i<26;i++){

            while(cap[i]-->0){

                capIndA.add(i);

            }

        }

        for(int i=0;i<26;i++){

            while(sma[i]-->0){

                smaIndA.add(i);

            }

        }

        StringBuffer t = new StringBuffer();

        char ch;

        int k=-1,j=-1;

        for(int i=0;i<str.length();i++){

            z = (int)(str.charAt(i));

            if(z>=65 && z<=90){

                k++;

                ch = (char)(capIndA.get(k)+65);

                t.append(ch);

            }

            else{

                j++;

                ch = (char)(smaIndA.get(j)+97);

                t.append(ch);

            }

        }

        return t.toString();

    }

}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {

    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);

    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends
