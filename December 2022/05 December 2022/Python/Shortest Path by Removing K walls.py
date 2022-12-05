#User function Template for python3

from collections import deque 
import math
class Solution:
    def isSafe(self, r, c, R, C, vis, key):
        return (r >= 0) and (r < R) and (c >=0 ) and (c < C) and (not key in vis)
    def shotestPath(self, grid, n, m, k):
        if len(grid) == len(grid[0]) == 1:
            return 0
        
        start = (0, 0, grid[0][0], 0) # R, C, obstacles, turn
        
        visited = {}
        q = deque((start,))
        
        while q:
            r, c, ct, turn = q.popleft()
            nxt = [
                (r,c-1),
                (r-1,c),
                (r+1,c),
                (r,c+1),
            ]
            for r2, c2 in nxt: 
                if 0 <= r2 < n and 0 <= c2 < m:
                    ct2 = ct + grid[r2][c2]
                    
                    nn = (r2, c2, ct2, turn+1)
                    
                    if ct2 <= k and (r2, c2) == (n-1,m-1):
                        return turn+1
                    
                    kk = (r2,c2)
                    # Don't explore a path we already reached with fewer obstacles
                    if ct2 <= k and visited.get(kk, math.inf) > ct2:
                        visited[kk] = ct2
                        q.append(nn)
        
        return -1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n,m,k=map(int,input().split())
        mat=[]
        for i in range(n):
            row = list(map(int,input().split()))
            mat.append(row)
        
        ob = Solution()
        print(ob.shotestPath(mat,n,m,k))
# } Driver Code Ends