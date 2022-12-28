# **Largest subtree sum in a tree**

## **Hard**

Given a binary tree. The task is to find subtree with maximum sum in the tree and return its sum.

**Example 1:**

```
Input:
              1
            /   \
           2      3
          / \    / \
         4   5  6   7
Output: 28
Explanation:
As all the tree elements are positive,
the largest subtree sum is equal to
sum of all tree elements.
```

```

Example 2:
Input:
               1
            /    \
          -2      3
          / \    /  \
         4   5  -6   2
Output: 7
Explanation:
Subtree with largest sum is :
  -2
 /  \
4    5
Also, entire tree sum is also 7.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **findLargestSubtreeSum()** which takes the root of a binary tree and returns an integer.

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(N)

**Constraints:**  
1 &lt;= N &lt;= 10^5  
-10^3 &lt;= tree.val &lt;= 10^3

> ### **Problem URL: [Largest subtree sum in a tree](https://practice.geeksforgeeks.org/problems/largest-subtree-sum-in-a-tree/1)**
