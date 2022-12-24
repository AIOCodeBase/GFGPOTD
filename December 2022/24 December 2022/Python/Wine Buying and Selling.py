class Solution:	
	def wineSelling(self, Arr, N):
	    buy=[]
	    sell=[]
	    for i in range(N):
	       if Arr[i]>0:
	           buy.append([Arr[i],i])
	       else:
	           sell.append([Arr[i],i])
	    ans=0
	    i=0
	    j=0
	    while i<len(buy) and j<len(sell):
	        x=min(buy[i][0],-sell[j][0])
	        buy[i][0]-=x
	        sell[j][0]+=x
	        diff=abs(buy[i][1]-sell[j][1])
	        ans+=x*diff
	        if buy[i][0]==0:
	            i+=1
	        if sell[j][0]==0:
	            j+=1
	    return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3


if __name__=='__main__':
    t = int(input())
    for i in range(t):
        N = int(input())
        Arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.wineSelling(Arr,N)
        
        print(ans)

# } Driver Code Ends