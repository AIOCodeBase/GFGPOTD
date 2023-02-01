class Solution:
    def minOperation(self, s): 
        n = len(s)
        maxi = 1
        for i in range(1, n//2+1):
            if s[:i] == s[i:i*2]:
                maxi = i
        return n - maxi + 1

    #{
 # Driver Code Starts
#Initial Template for Python 3


if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        ob = Solution()
        ans = ob.minOperation(s)
        print(ans)
# } Driver Code Ends
