class Solution:
    def countPairs(self, n, arr, k):
        
        cnt = 0
      
        for i in range(n):
            arr[i] = (arr[i] + k) % k
      
        hash = [0]*k
      
        for i in range(n):
            hash[arr[i]] += 1
      
        for i in range(k):
            cnt += (hash[i] * (hash[i] - 1)) // 2
      
        return cnt

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n=int(input())
        arr=list(map(int,input().split()))
        k=int(input())
        
        ob = Solution()
        print(ob.countPairs(n,arr,k))
# } Driver Code Ends