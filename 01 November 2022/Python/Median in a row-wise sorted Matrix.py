#User function Template for python3

from bisect import bisect_right
class Solution:
    def median(self, matrix, r, c):
        min=float("inf")
        max=-float("inf")
        for i in range(r):
            if matrix[i][0]<min:
                min=matrix[i][0]
            if matrix[i][c-1]>max:
                max=matrix[i][c-1]
        desired=(r*c+1)//2
        while min<max:
            mid=(max+min)//2
            place=0
            for i in range(r):
                place+=bisect_right(matrix[i],mid)
            if place<desired:
                min=mid+1
            else:
                max=mid
        
        return min  


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    ob = Solution()
    t = int (input ())
    for _ in range (t):
        r,c = map(int,input().strip().split())
        matrix = [[0 for j in range(c)] for i in range(r)]
        for i in range(r):
            t=[int(el) for el in input().split()]
            for j in range(c):
                matrix[i][j]=t[j]
        ans = ob.median(matrix, r, c);
        print(ans)
# } Driver Code Ends