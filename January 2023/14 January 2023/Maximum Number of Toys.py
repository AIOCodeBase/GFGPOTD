n=10**6+5
fr=[0]*n
class tree:
    def __init__(self) -> None:
        self.bit=[0]*n
    def add(self,node,v):
        while node < n:
            self.bit[node]+=v
            node+=node&(-node)
    def get(self,node):
        sumt=0
        while node>0:
            sumt+=self.bit[node]
            node-=node&(-node)
        return sumt

t1,t2=tree(),tree()
class Solution:
    def maximumToys(self,n,A,Q,Queries):
        new=[]
        for i in A:
            fr[i]+=1
        for i in A:
            t1.add(i,i)
            t2.add(i,1);
        for i in Queries:
            C=i[0]
            for j in range(2,len(i)):
                t1.add(A[i[j]-1],-A[i[j]-1])
                t2.add(A[i[j]-1],-1);
            lw,hg=1,10**6
            pos=10**6
            while(lw<=hg):
                mid=(lw+hg)//2;
                if(t1.get(mid)>=C):
                    pos=mid;
                    hg=mid-1;
                else:
                    lw=mid+1;
            ans=t2.get(pos-1);
            mx=min((C-t1.get(pos-1))//pos,fr[pos]);
            ans+=mx;
            new.append(ans);
            for j in range(2,len(i)):
                t1.add(A[i[j]-1],A[i[j]-1]);
                t2.add(A[i[j]-1],1);
        for i in range(len(A)):
            t1.add(A[i],-A[i]);
            t2.add(A[i],-1);
            fr[A[i]]-=1;
        return new;

#{ 
 # Driver Code Starts


for _ in range(int(input())):
    N=int(input())
    A=[int(i) for i in input().strip().split()]
    Q=int(input())
    Queries=[[] for i in range(Q)]
    for i in range(Q):
        Queries[i].extend(int(i) for i in input().strip().split())
    obj=Solution()
    ans=obj.maximumToys(N,A,Q,Queries)
    for i in ans:
        print(i,end=" ")
    print()
    


# } Driver Code Ends