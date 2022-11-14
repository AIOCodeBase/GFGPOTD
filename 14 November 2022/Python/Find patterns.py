#User function Template for python3
class Solution:
    def numberOfSubsequences (self,S,W):
        ans=int()
        s=[char for char in S]
        w=[char for char in W]
        i,j=[0]*2
        while i<len(s) and j<len(w):
            if s[i]==w[j]:
                s[i]='dinesh'
                i+=1
                j+=1
            else:i+=1
            if len(w)==j:ans+=1;i,j=[0]*2
        return ans;

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=str(input())
        W=str(input())

        ob = Solution()
        print(ob.numberOfSubsequences(S,W))

# } Driver Code Ends