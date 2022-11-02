//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            int n = a[0],m=a[1],k=a[2];
            
            int[][] e = IntMatrix.input(br, a[2], 2);
            
            Solution obj = new Solution();
            int res = obj.largestArea(n,m,k,e);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


       

class Solution {
    public static int largestArea(int n,int m,int k,int[][] enemy) {
        // code here
        List<Integer> row=new ArrayList<>(n);
        List<Integer> col= new ArrayList<>(m);
        for(int i=0;i<n;i++) row.add(-1);
        for(int i=0;i<m;i++) col.add(-1);
        for(int[] r:enemy){
            row.set(r[0]-1,1);
            col.set(r[1]-1,1);
        }
        
        //System.out.println(row);
        //System.out.println(col);
        int maxLenR=0;
        int currLen=0;
        int maxLenC=0;
        for(int i=0;i<row.size();i++){
            
        
            if(row.get(i)==-1) currLen++;
            else currLen=0;
            maxLenR=Math.max(maxLenR,currLen);
            
        }
        int curr=0;
        for(int i=0;i<col.size();i++){
            
            
            if(col.get(i)==-1) curr++;
            else curr=0;
            maxLenC=Math.max(maxLenC,curr);
        }
        return maxLenC*maxLenR;

    }
}
 
