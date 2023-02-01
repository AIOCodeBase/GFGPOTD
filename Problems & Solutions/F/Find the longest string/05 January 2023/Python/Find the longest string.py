class TrieNode:
    def __init__(self):
        self.children = [None for i in range(26)]
        self.isWord = False
class Trie:
    def __init__(self):
        self.Tree = TrieNode()
    def insert(self, s):
        cur = self.Tree
        prev = None
        for i in s:
            if cur.children[self.index(i)] is None:
                cur.children[self.index(i)] = TrieNode()
            prev = cur
            cur = cur.children[self.index(i)]
        cur.isWord =True
    
    def contains(self, s):
        cur = self.Tree
        cur.isWord=True
        prev = None
        for i in s:
            if cur.children[self.index(i)] is None or cur.isWord == False:
                return False
            prev = cur
            cur = cur.children[self.index(i)] 
        return True

    def index(self, char):
        return ord(char) - ord("a")

class Solution():
    def longestString(self, arr, n):
        trie = Trie()
        for s in arr:
            trie.insert(s)
        ans = ""
        
        for s in arr:
            if trie.contains(s):
                if len(s)>len(ans):
                    ans = s
                elif len(s) == len(ans):
                    ans = min(ans, s)
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        n = int(input())
        arr = [i for i in input().split()]
        print(Solution().longestString(arr,n))
# } Driver Code Ends