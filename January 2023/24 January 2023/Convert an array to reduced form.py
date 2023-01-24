#User function Template for python3
class Solution:

	def convert(self,arr, n):
		brr = sorted(arr)
        lst = {}
        for i in range(n):
            lst[brr[i]]=i
        for j in range(n):
            arr[j]=lst[arr[j]]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.convert(arr, n)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends
