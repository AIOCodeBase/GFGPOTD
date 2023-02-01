class Solution:
    def ncr(self,n,r):
        if r>n:
            return 0
        if r==0 or r==n:
            return 1
        if self.cache[n][r]!=-1:
            return self.cache[n][r]
        res=self.ncr(n-1,r-1)+self.ncr(n-1,r)
        self.cache[n][r]=res
        return res
    def count (self, N):
        self.cache=[[-1]*(40) for _ in range(40)]
        res=0
        ones=0
        bits=0
        while N!=0:
            if N&1:
                res+=self.ncr(bits,ones+1)
                ones+=1
            bits+=1
            N>>=1
        return res

#{ 
 # Driver Code Starts
if __name__ == '__main__': 
    ob = Solution()
    t = int (input ())
    for _ in range (t):
        N = int(input())
        print(ob.count(N))



# } Driver Code Ends