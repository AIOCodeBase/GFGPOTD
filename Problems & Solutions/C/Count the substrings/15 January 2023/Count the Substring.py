class Solution():
    def countSubstring(self, S):
        n= len(S)
        ans=0
        zero=n
        minus=0
        mp = [0]*(2*n+5)
        cur=zero
        for i in S:
            if(i=='0'):
                cur-=1
            else:
                cur+=1
            if(cur<=zero):
                minus+=1
            
            mp[cur]+=1
        for i in range(n):
            ans+=(n-i-minus)
            if(S[i]=='1'):
                mp[zero+1]-=1
                zero+=1
                minus+=mp[zero]
            
            else:
                mp[zero-1]-=1
                zero-=1
                minus-=1
                minus-=mp[zero+1]
            
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        s = input()
        print(Solution().countSubstring(s))
# } Driver Code Ends