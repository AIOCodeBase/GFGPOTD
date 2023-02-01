class Solution:
    def distinctColoring (self, N, r, g, b):
        arr=[r,g,b]
        for i in range(N-2,-1,-1):
            arr[0][i]+=min(arr[1][i+1],arr[2][i+1])
            arr[1][i]+=min(arr[0][i+1],arr[2][i+1])
            arr[2][i]+=min(arr[1][i+1],arr[0][i+1])
        return min(arr[0][0],arr[1][0],arr[2][0])

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        r = list(map(int, input().split()))
        g = list(map(int, input().split()))
        b = list(map(int, input().split()))

        ob = Solution()
        print(ob.distinctColoring(N, r, g, b))
# } Driver Code Ends