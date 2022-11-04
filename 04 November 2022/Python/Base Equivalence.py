#User function Template for python3
class Solution:
	def baseEquiv(self, n, m):
        if n<=32 and m==1:
            return "Yes"
        for i in range(32):
            cnt=0
            x=1
            while (n>x):
                x*=i
                cnt+=1
                if cnt>m:
                    break
            if cnt==m:
                return "Yes"
        return "No"


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n,m = input().split()
		n=int(n)
		m=int(m)
		ob = Solution();
		print(ob.baseEquiv(n,m))

# } Driver Code Ends