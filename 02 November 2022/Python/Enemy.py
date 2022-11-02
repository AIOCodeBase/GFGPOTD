from typing import List

class Solution:
    def largestArea(self,n:int,m:int,k:int, enemy : List[List[int]]) -> int:
        # code here
        rows=[]
        cols=[]
        if k==0:
            return n*m
        for i in e:
            rows.append(i[0])
            cols.append(i[1])
        rows.sort()
        cols.sort()
        #print(rows,cols)
        #This is for calculating the area above the "first blocked" row and the area
        # below the last blocked row
        le=max(rows[0]-1,n-rows[k-1])
        #This is for calculating the area left to the "first blocked" cols adn the area
        #right to the "last blocked" cols
        wid=max(cols[0]-1,m-cols[k-1])
        #If there are blocked rows in between the first and last blocked rows
        #And If there are blocked cols in between the left and right cols
        for i in range(1,k):
            le=max(le,(rows[i]-(rows[i-1])-1))
        for i in range(1,k):
            wid=max(wid,(cols[i]-(cols[i-1])-1))
        return le*wid
        

#{ 
 # Driver Code Starts
class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()



class IntMatrix:
    def __init__(self) -> None:
        pass
    def Input(self,n,m):
        matrix=[]
        #matrix input
        for _ in range(n):
            matrix.append([int(i) for i in input().strip().split()])
        return matrix
    def Print(self,arr):
        for i in arr:
            for j in i:
                print(j,end=" ")
            print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        a=IntArray().Input(3)
        n,m,k=a[0],a[1],a[2]
        
        e=IntMatrix().Input(a[2], 2)
        
        obj = Solution()
        res = obj.largestArea(n,m,k, e)
        
        print(res)
        

# } Driver Code Ends