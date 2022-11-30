#User function Template for python3

class Solution:
    def minPartition(self, N):
        l = [1,2,5,10,20,50,100,200,500,2000]
        res = 0
        ans = []
        for i in l[::-1]:
            if N>=i:
                res += N//i
                ans.extend([i]*(N//i))
                N = N%i
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        
        ob = Solution()
        arr = ob.minPartition(N)
        for i in range(len(arr)):
            print(arr[i],end=" ")
        print()
# } Driver Code Ends