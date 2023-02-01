#User function Template for python3
class Solution:
    def isSumOfTwo (self, N):
        # code here 
        if N<=2:
            return "No"
        elif N%2==0:
            return "Yes"
        else:
            k=0
            for i in range(2,int((N-2)**0.5)+1):
                if(N-2)%i==0:
                    k+=1
            return "Yes" if k==0 else "No"

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        
        ob = Solution()
        print(ob.isSumOfTwo(N))
# } Driver Code Ends