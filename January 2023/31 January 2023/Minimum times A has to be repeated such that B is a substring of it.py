class Solution:
    def issubstring(self, str2, rep):
        if str2 in rep:
            return True
        return False
    
    def minRepeats(self, A, B):
        ans = 1
        S = A
        
        while len(S)<len(B):
            S += A 
            ans += 1 
            
        if self.issubstring(B,S):
            return ans 
        elif self.issubstring(B,S+A):
            return ans+1 
        else:
            return -1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        A=input()
        B=input()
        
        ob = Solution()
        print(ob.minRepeats(A,B))
# } Driver Code Ends
