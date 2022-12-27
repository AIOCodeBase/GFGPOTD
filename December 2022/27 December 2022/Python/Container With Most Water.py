def maxArea(A,le):
    l = 0
    r = le-1 
    area = 0
    
    while(l<r):
        area = max(area, min(A[l], A[r]) * (r - l))
        if(A[l]<A[r]):
            l+=1
        else:
            r-=1

    return area 

#{ 
 # Driver Code Starts
#Initial Template for Python 3



for _ in range(0,int(input())):
    
    n = int(input())
    l = list(map(int,input().split()))
    
    print(maxArea(l,n))
    
    
# } Driver Code Ends