# **Best Node**

## **Medium**

You are given a tree rooted at node 1. The tree is given in form of an array P where Pi denotes the parent of node i, Also P1 = -1, as 1 is the root node. Every node i has a value Ai associated with it. At first, you have to choose any node to start with, after that from a node you can go to any of its child nodes. You've to keep moving to a child node until you reach a leaf node. Every time you get to a new node, you write its value. Let us assume that the integer sequence in your path is B.
Let us define a function f over B, which is defined as follows:
f(B) = B1 - B2 + B3 - B4 + B5.... + $(-1)^(k-1)Bk$.
You have to find the maximum possible value of f(B).

**Example 1:**

```
Input:
N = 3,
A = { 1, 2, 3}
P = {-1, 1, 1}
Output:
3
Explanation:
The resulting tree is:
        1(1)
      /     \
     2(2)   3(3)
If we choose our starting node as 3, then the
resulting sequence will be B = { 3 },
which will give the maximum possible value.
```

**Example 2:**

```
Input:
N = 3,
A = { 3, 1, 2}
P = {-1, 1, 2}
Output:
4
Explanation:
The resulting tree is:
  1(3)
  |
  2(1)
  |
  3(2)
If we choose our starting node as 1, then the
resulting sequence will be B = { 3 , 1 , 2 }.
The value which we'll get is, 3-1+2 = 4, which
is the maximum possible value.
```

**Your Task:**  

The task is to complete the function bestNode() which takes an integer N and two integer arrays A, P as input parameters and returns the maximum possible value possible.

**Expected Time Complexity:** O(N)  
**Expected Space Complexity:** O(N)    

**Constraints:**

1 ≤  N ≤ $10^5$  
$-10^5$ ≤  Ai ≤ $10^5$  
-1 ≤  Pi ≤ N     

> ### **Problem URL: [Best Node](https://practice.geeksforgeeks.org/problems/a3493283697b7b69573a840f371a55ccd9332bb0/1)**
