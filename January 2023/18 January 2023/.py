#User function Template for python3

""" Node Class
    class Node:
        def __init__(self, data):   # data -> value stored in node
            self.data = data
            self.next = None
"""

from collections import defaultdict
class Solution:
    #Function to find first node if the linked list has a loop.
    def findFirstNode(self, head):
        d = defaultdict(int)
        curr = head
        while curr is not None:
            if d[curr]==0:
                d[curr] = 1
                curr=curr.next
            else:
                return curr.data
        return -1


        #{
 # Driver Code Starts
#Initial Template for Python 3

# Node Class
class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None

# Linked List Class
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    # creates a new node with given value and appends it at the end of the linked list
    def insert(self, val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next

    #connects last node to node at position pos from begining.
    def loopHere(self,pos):
        if pos==0:
            return

        walk = self.head
        for i in range(1,pos):
            walk = walk.next

        self.tail.next = walk

if __name__ == '__main__':
    for _ in range(int(input())):
        n = int(input())

        LL = LinkedList()
        for i in input().split():
            LL.insert(int(i))

        LL.loopHere(int(input()))

        print(Solution().findFirstNode(LL.head))
# } Driver Code Ends
