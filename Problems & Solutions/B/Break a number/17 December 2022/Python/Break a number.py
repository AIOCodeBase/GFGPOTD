class Solution:
    def waysToBreakNumber (self,N):
        return (((N+1)*(N+2))//2)%(10**9+7)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        
        ob = Solution()
        print(ob.waysToBreakNumber(n))
        
# } Driver Code Ends