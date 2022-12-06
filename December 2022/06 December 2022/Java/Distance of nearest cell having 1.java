//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    boolean isValid(int x, int y, int n, int m)
    {
		if (x>=0 && x<n && y>=0 && y<m)
		    return true;
		return false;
	}
	
    public int[][] nearest(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                dp[i][j] = 10000000;
        
        Queue<ArrayList<Integer>> q = new LinkedList<>(); 
        
        
        for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < m; j++)
			{
				if(grid[i][j] == 1){
					dp[i][j] = 0;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					q.add(temp);
				}
			}
		}
		
		while(!q.isEmpty())
		{
			ArrayList <Integer> curr = q.poll();
			int x = curr.get(0);
			int y = curr.get(1);
			
			for(int i = 0; i < 4; i++)
			{
				int n_x = x + dx[i];
				int n_y = y + dy[i];
				
				if(isValid(n_x, n_y, n, m) && dp[n_x][n_y] > dp[x][y] + 1)
				{
					dp[n_x][n_y] = dp[x][y] + 1;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(n_x);
					temp.add(n_y);
					q.add(temp);
				}
			}
		}
		return dp;
    }
}