class Solution:
    def BalancedString(self,N):
        ans=""
        full="abcdefghijklmnopqrstuvwxyz"
        a=N//26
        b=N%26
        for _ in range(a):
            ans=ans+full
        if(N%2==0):
            for i in range(b//2):
                ans=ans+full[i]
            for i in range(26-b//2,26):
                ans=ans+full[i]
        else:
            SumOfDigits=0
            temp=N
            while(temp!=0):
                SumOfDigits=SumOfDigits+(temp)%10
                temp=temp//10  
            if(SumOfDigits%2):
                for i in range((b-1)//2):
                    ans=ans+full[i]
                for i in range(26-(b+1)//2,26):
                    ans=ans+full[i]    
            else:   
                for i in range((b+1)//2):
                    ans=ans+full[i]
                for i in range(26-(b-1)//2,26):
                    ans=ans+full[i]
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N=int(input())
        
        ob=Solution()
        print(ob.BalancedString(N))
# } Driver Code Ends