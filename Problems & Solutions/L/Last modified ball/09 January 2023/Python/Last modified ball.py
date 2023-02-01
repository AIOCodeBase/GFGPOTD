class Solution():
    def solve(self, N, A):
        c = 1
        for i in range(n-1,-1,-1):
            if A[i] != 9:
                break
        return i+1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

for _ in range(int(input())):
    n = int(input())
    array=[int(i) for i in input().split()]
    obj = Solution()
    print(obj.solve(n, array))
# } Driver Code Ends