#User function Template for python3

class Solution:
    def rearrange(self, S, N):
        st=set()
        st.add("a")
        st.add("e")
        st.add("i")
        st.add("o")
        st.add("u")
        vow=[0]*(26)
        cons=[0]*(26)
        numVow=0
        numCons=0
        smallestVow="u"
        smallestCons="z"
        for i in range(N):
            if S[i]<"a" or S[i]>"z":
                return -1
            if S[i] not in st:
                cons[ord(S[i])-ord("a")]+=1
                numCons+=1
                if S[i]<smallestCons:
                    smallestCons=S[i]
            else:
                vow[ord(S[i])-ord("a")]+=1
                numVow+=1
                if S[i]<smallestVow:
                    smallestVow=S[i]
        if abs(numVow-numCons)>1:
            return "-1"
        if numVow==numCons:
            if smallestVow<smallestCons:
                putVow=True
            else:
                putVow=False
        elif numVow>numCons:
            putVow=True
        else:
            putVow=False
        i=0
        j=0
        itr=0
        S=[el for el in S]
        while i<26 or j<26:
            if putVow:
                while i<26 and vow[i]==0:
                    i+=1
                
                if i==26:
                    break
                S[itr]=chr(ord("a")+i)
                itr+=1
                vow[i]-=1
                putVow=False
            else:
                while j<26 and cons[j]==0:
                    j+=1
                if j==26:
                    break
                S[itr]=chr(ord("a")+j)
                itr+=1
                cons[j]-=1
                putVow=True
        return "".join(S)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N = int(input().strip())
        S = input().strip()
        ob=Solution()
        ans=ob.rearrange(S, N)
        print(ans)
# } Driver Code Ends
