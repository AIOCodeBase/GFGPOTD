import heapq

class Solution:
    def minimizeSum(self, N, arr):
        heapq.heapify(arr)
        ans = 0
        while len(arr) != 1:
            x = heapq.heappop(arr)
            y = heapq.heappop(arr)
            z = x+y
            heapq.heappush(arr, z)
            ans += z
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    
    for _ in range(t):
        n = int(input())
        A = [int(x) for x in input().split()]
        ob=Solution()
        print(ob.minimizeSum(n, A))
# } Driver Code Ends