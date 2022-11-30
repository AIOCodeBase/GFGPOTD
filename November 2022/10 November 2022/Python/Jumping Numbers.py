#User function Template for python3

class Solution:
    def jumpingNums(self, X):
        if X<=9:
            return X
        diff = X
        ans = 0
        def solve(v):
            nonlocal ans,diff
            if v>X:
                return 
            if v<= X and v>ans:
                ans = v
                diff = X-v
            rem = v%10
            if rem>0:
                solve(v*10 + rem-1)
            if rem<9:
                solve(v*10 + rem+1)
            return 
        for i in range(1,10):
            solve(i)
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        X=int(input())
        
        ob = Solution()
        print(ob.jumpingNums(X))
# } Driver Code Ends