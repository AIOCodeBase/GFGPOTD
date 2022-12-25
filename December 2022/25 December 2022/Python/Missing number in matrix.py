class Solution:
	def MissingNo(self, matrix):
		nonzero=[]
		zero=[]
		for i in range(len(matrix)):
		    f=True
		    sum=0
		    for j in range(len(matrix[i])):
		        sum+=matrix[i][j]
		        if not matrix[i][j]:
		            f=False
		    if f:
		        nonzero.append(sum)
		    else:
		        zero.append(sum)
		for j in range(len(matrix[0])):
		    f=True
		    sum=0
		    for i in range(len(matrix)):
		        sum+=matrix[i][j]
		        if not matrix[i][j]:
		            f=False
		    if f:
		        nonzero.append(sum)
		    else:
		        zero.append(sum)
		f=True
		sum=0
		for i in range(len(matrix)):
		    sum+=matrix[i][i]
		    if not matrix[i][i]:
		        f=False
		if f:
		    nonzero.append(sum)
		else:
		    zero.append(sum)
		f=True
		sum=0
		i=0
		j=len(matrix[0])-1
		while i<len(matrix) and j>=0:
		    sum+=matrix[i][j]
		    if not matrix[i][j]:
		        f=False
		    i+=1
		    j-=1
		if f:
		    nonzero.append(sum)
		else:
		    zero.append(sum)
		if len(set(zero))==1 and len(set(nonzero))==1:
		    x=zero[0]
		    y=nonzero[0]
		    if x>=y:
		        return -1
		    return y-x
		return -1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		matrix = []
		for _ in range(n):
			matrix.append(list(map(int,input().split())))
		ob = Solution()
		ans = ob.MissingNo(matrix)
		print(ans)

# } Driver Code Ends
