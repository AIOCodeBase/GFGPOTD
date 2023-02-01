class Solution:
    def carpetBox(self, A,B,C,D):
        #code here
        dp = dict()
        return self.solve(A,B,C,D,dp)
        
    def solve(self,a,b,c,d,dp):
        if (a,b) in dp:
            return dp[(a,b)]
        if max(a,b) <= max(c,d) and min(a,b) <= min(c,d):
            return 0
        x =10**9
        y = 10**9
        z = 10**9
        if min(a,b) < max(c,d):
            if a <= c or a <= d:
                x = self.solve(a,b//2,c,d,dp)+1
            if b<=c or b<=d:
                y = self.solve(a//2,b,c,d,dp)+1
        else:
            z = min(self.solve(a//2,b,c,d,dp),self.solve(a,b//2,c,d,dp)) + 1
        dp[(a,b)] = min(x,y,z)
        return dp[(a,b)]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():
        T=int(input())
        while(T>0):
            A,B,C,D = map(int, input().split())
            
            obj = Solution()
            print(obj.carpetBox(A,B,C,D))
            
            T-=1


if __name__ == "__main__":
    main()


# } Driver Code Ends