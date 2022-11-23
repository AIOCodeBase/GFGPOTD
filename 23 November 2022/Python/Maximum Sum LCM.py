#User function Template for python3
class Solution:
    def maxSumLCM (self, n):
        max_sum=0
        i=1
        while i**2<=n:
            if n%i==0:
                max_sum+=i
                if n//i!=i:
                    max_sum+=n//i
            i+=1
        return max_sum

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n = int(input())
        
        ob = Solution()
        print(ob.maxSumLCM(n))
# } Driver Code Ends