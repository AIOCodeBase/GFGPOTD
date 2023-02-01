class Solution:    
    def gcd(self,A,B):
        if(B==0):
            return A
        return self.gcd(B,A%B) 
    def lcm(self,N):
        if N==4:
            return 12
        a=N*(N-1)
        b=a
        b*=(N-2)//self.gcd(b,N-2)
        b*=(N-3)//self.gcd(b,N-3)
        c=a
        f=0
        for i in range(N-2,0,-1):
            if self.gcd(c,i)==1:
                a*=i
                c*=i
                f+=1
            if f==2:
                break
        return max(a,b)
    def maxGcd(self,N):
        if N==4:
            return 12
        return max(self.lcm(N),self.lcm(N-1)) 

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math
        
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N=(int)(input())
        ob=Solution()
        print(ob.maxGcd(N))
# } Driver Code Ends
