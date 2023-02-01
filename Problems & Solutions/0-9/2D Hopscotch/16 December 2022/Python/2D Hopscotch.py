class Solution:
    def valid(self,i,j,n,m):
        if i>=0 and j>=0 and i<n and j<m:
            return True
        return False
    
    def hopscotch(self, n, m, mat, ty, i, j):
        sum=0
        if ty==0:
            if j%2==0:
                if self.valid(i-1,j-1,n,m):
                    sum+=mat[i-1][j-1]
                if self.valid(i-1,j,n,m):
                    sum+=mat[i-1][j]
                if self.valid(i-1,j+1,n,m):
                    sum+=mat[i-1][j+1]
                if self.valid(i,j-1,n,m):
                    sum+=mat[i][j-1]
                if self.valid(i,j+1,n,m):
                    sum+=mat[i][j+1]
                if self.valid(i+1,j,n,m):
                    sum+=mat[i+1][j]
            else:
                if self.valid(i-1,j,n,m):
                    sum+=mat[i-1][j]
                if self.valid(i,j-1,n,m):
                    sum+=mat[i][j-1]
                if self.valid(i,j+1,n,m):
                    sum+=mat[i][j+1]
                if self.valid(i+1,j-1,n,m):
                    sum+=mat[i+1][j-1]
                if self.valid(i+1,j,n,m):
                    sum+=mat[i+1][j]
                if self.valid(i+1,j+1,n,m):
                    sum+=mat[i+1][j+1]
        else:
            if j%2==0:
                if self.valid(i-2,j-1,n,m):
                    sum+=mat[i-2][j-1]
                if self.valid(i-2,j,n,m):
                    sum+=mat[i-2][j]
                if self.valid(i-2,j+1,n,m):
                    sum+=mat[i-2][j+1]
                if self.valid(i-1,j-2,n,m):
                    sum+=mat[i-1][j-2]
                if self.valid(i-1,j+2,n,m):
                    sum+=mat[i-1][j+2]
                if self.valid(i,j-2,n,m):
                    sum+=mat[i][j-2]
                if self.valid(i,j+2,n,m):
                    sum+=mat[i][j+2]
                if self.valid(i+1,j-2,n,m):
                    sum+=mat[i+1][j-2]
                if self.valid(i+1,j-1,n,m):
                    sum+=mat[i+1][j-1]
                if self.valid(i+1,j+1,n,m):
                    sum+=mat[i+1][j+1]
                if self.valid(i+1,j+2,n,m):
                    sum+=mat[i+1][j+2]
                if self.valid(i+2,j,n,m):
                    sum+=mat[i+2][j]
            else:
                if self.valid(i-1,j-2,n,m):
                    sum+=mat[i-1][j-2]
                if self.valid(i-1,j-1,n,m):
                    sum+=mat[i-1][j-1]
                if self.valid(i-2,j,n,m):
                    sum+=mat[i-2][j]
                if self.valid(i-1,j+1,n,m):
                    sum+=mat[i-1][j+1]
                if self.valid(i-1,j+2,n,m):
                    sum+=mat[i-1][j+2]
                if self.valid(i,j-2,n,m):
                    sum+=mat[i][j-2]
                if self.valid(i,j+2,n,m):
                    sum+=mat[i][j+2]
                if self.valid(i+1,j-2,n,m):
                    sum+=mat[i+1][j-2]
                if self.valid(i+1,j+2,n,m):
                    sum+=mat[i+1][j+2]
                if self.valid(i+2,j-1,n,m):
                    sum+=mat[i+2][j-1]
                if self.valid(i+2,j,n,m):
                    sum+=mat[i+2][j]
                if self.valid(i+2,j+1,n,m):
                    sum+=mat[i+2][j+1]
        return sum

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, m = [int(x) for x in input().split()]
        mat = [[0]*m for x in range(n)]
        for i in range(n):
            arr = input().split()
            for j in range(m):
                mat[i][j] = int(arr[j])
        ty, i, j = map(int,input().strip().split())
        
        ob = Solution()
        print(ob.hopscotch(n, m, mat, ty, i, j))
# } Driver Code Ends