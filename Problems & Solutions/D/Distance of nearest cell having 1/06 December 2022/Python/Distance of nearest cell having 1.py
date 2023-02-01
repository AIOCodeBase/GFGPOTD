from collections import deque
class Solution:
    
    def isValid(self, x, y, n, m):
        return (x >= 0 and x < n and y >= 0 and y < m)
        
    def nearest(self, grid):
        
        dx = [-1,1,0,0]
        dy = [0,0,-1,1]
        n = len(grid)
        m = len(grid[0])
        
        dp = [[100000 for i in range(m)] for j in range(n)]
        
        q = deque()
        
        for i in range(n):
            for j in range(m):
                
                if(grid[i][j] == 1):
                    dp[i][j] = 0
                    q.append([i,j])
                    
                    
        while(len(q)):
            
            cur = q.popleft()
            x = cur[0]
            y = cur[1]
            
            for i in range(4):
                n_x = x + dx[i]
                n_y = y + dy[i]
                if(self.isValid(n_x,n_y,n,m) and dp[n_x][n_y]>dp[x][y]+1):
                    
                    dp[n_x][n_y] = dp[x][y] + 1
                    q.append([n_x, n_y])
        
        return dp

#{ 
 # Driver Code Starts
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n, m = map(int, input().split())
		grid = []
		for _ in range(n):
			a = list(map(int, input().split()))
			grid.append(a)
		obj = Solution()
		ans = obj.nearest(grid)
		for i in ans:
			for j in i:
				print(j, end = " ")
			print()

# } Driver Code Ends