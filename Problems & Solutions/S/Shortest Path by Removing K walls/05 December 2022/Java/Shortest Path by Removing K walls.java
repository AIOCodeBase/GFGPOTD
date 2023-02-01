//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(St[0]);
            int m = Integer.parseInt(St[1]);
            int k = Integer.parseInt(St[2]);
            
            int[][] mat = new int[n][m];
            
            for(int i=0; i<n; i++)
            {
                String S[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                    mat[i][j] = Integer.parseInt(S[j]);
            }

            Solution ob = new Solution();
            System.out.println(ob.shotestPath(mat,n,m,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    class Node{
        int r,c,k,dist;
        Node(int r,int c,int k,int dist){this.r=r; this.c=c; this.k=k; this.dist=dist; }
    }
    int shotestPath(int[][] grid, int m, int n, int k) {
        // code here
        int directions[] = {0,1,0,-1,0};
        Queue<Node> q = new LinkedList<>();
        boolean vis[][][] = new boolean[m][n][k+1];
        vis[0][0][0]=true;
        q.add(new Node(0,0,0,0));
        while(!q.isEmpty()){
            Node front = q.poll();
            if(front.r==m-1 && front.c==n-1) return front.dist;
            for(int dir=0;dir<4;++dir){
                int newr=front.r+directions[dir], newc=front.c+directions[dir+1];
                if(newr>=0 && newr<m && newc>=0 && newc<n){
                    int newk=front.k+grid[newr][newc];
                    if(newk<=k && !vis[newr][newc][newk]){
                        vis[newr][newc][newk]=true;
                        q.add(new Node(newr,newc,newk,front.dist+1));
                    }
                }
            }
        }
        return -1;
    }
};