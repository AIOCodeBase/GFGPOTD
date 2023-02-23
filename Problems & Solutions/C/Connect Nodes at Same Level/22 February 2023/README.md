# **Connect Nodes at Same Level**

## **Medium**

Given a binary tree, connect the nodes that are at the same level. The structure of the tree Node contains an addition nextRight pointer for this purpose.

Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.
   
**Example 1:**

```
Input:
     3
   /  \
  1    2
Output:
3 1 2
1 3 2
Explanation:The connected tree is
       3 ------> NULL
     /   \
    1---> 2 -----> NULL
```

**Example 2:**

```
Input:
      10
    /   \
   20   30
  /  \
 40  60
Output:
10 20 30 40 60
40 20 60 10 30
Explanation:The connected tree is
        10 ---> NULL
       /   \
     20---> 30 ---> NULL
   /   \
 40---> 60 ---> NULL
```

**Your Task:**  
You don't have to read input or print anything. Complete the function connect() that takes the root of the tree as  input parameter and connects the nodes that lie at the same level. 

Note: The generated output will contain 2 lines. First line contains the level order traversal of the tree and second line contains the inorder traversal of the tree.

**Expected Time Complexity:** O(N)  
**Expected Space Complexity:** O(N)    

**Constraints:**

1 ≤ Number of nodes ≤ $10^5$  
0 ≤ Data of a node ≤ $10^5$     

> ### **Problem URL: [Connect Nodes at Same Level](https://practice.geeksforgeeks.org/problems/95423710beef46bd66f8dbb48c510b2c320dab05/1)**
