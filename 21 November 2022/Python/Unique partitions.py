#User function Template for python3

class Solution:
	def UniquePartitions(self, n):
        # Code here
        
        def partitions(num,Sum,res,out):
            
            if Sum>target or num<=0:
                return 
            
            if Sum==target:
                out.append(res)
                return
            
            res1 = res[:]
            res2 = res[:]
            res1 = res1+[num]
            partitions(num,Sum+num,res1,out)
            partitions(num-1,Sum,res2,out)
            
            return
        
        Sum = 0
        res = []
        out = []
        target = n
        partitions(n,Sum,res,out)
        return out

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n= int(input())
		ob = Solution()
		ans = ob.UniquePartitions(n)
		for a in ans:
			for b in a:
				print(b, end = " ")
		print()

# } Driver Code Ends