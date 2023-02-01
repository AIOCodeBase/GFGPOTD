class Solution: 
   def minLaptops(self, N, start, end):
        
        mp=dict()
        
        for i in start:
            if i in mp:
                mp[i] += 1
            else:
                mp[i] = 1
        for i in end:
            if i in mp:
                mp[i] += -1
            else:
                mp[i] = -1
        
        c = ans = 0
        for i in sorted(mp):
            c += mp[i]
            ans = max(ans,c)
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    
    T = int(input())
    while T > 0: 
        N = int(input())
        start = list(map(int,input().split()))
        end = list(map(int,input().split()))
            
        ob = Solution()
        print(ob.minLaptops(N, start, end))
        
        T -= 1

# } Driver Code Ends