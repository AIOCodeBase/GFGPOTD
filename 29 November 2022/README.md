# **Count the Number of Full Binary Trees**

## **Medium**

Given an array **arr\[\]** of **n** integers, where each integer is greater than 1. The task is to find the number of [Full binary tree](http://quiz.geeksforgeeks.org/binary-tree-set-3-types-of-binary-tree/) from the given integers, such that each non-leaf node value is the product of its children value.

**Note:** Each integer can be used multiple times in a full binary tree. The answer can be large, return answer modulo 1000000007

**Example 1:**

```
Input:
n = 4
arr[] = {2, 3, 4, 6}
Output:
7
Explanation:
There are 7 full binary tree with
the given product property.
Four trees with single nodes
2  3  4  6
Three trees with three nodes
    4
   / \
  2   2 ,
   6
  / \
 2   3 ,
   6
  / \
 3   2
```

**Example 2:**

```
Input:
n = 3
arr[] = {2, 4, 5}
Output: 4
Explanation: There are 4 full binary tree
with the given product property.
Three trees with single nodes 2 4 5
One tree with three nodes
   4
  / \
 2  2
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **numoffbt()** which takes the array **arr\[\]**and its size \*\*n as inputs and returns the number of Full binary tree.

**Expected Time Complexity:** O(n. Log(n))  
**Expected Auxiliary Space:** O(n)

**Constraints:**  
1 ≤ n ≤ 10^5  
2 ≤ arr\[i\] ≤ 10^5

> ### **Problem URL: [Count the Number of Full Binary Trees](https://practice.geeksforgeeks.org/problems/count-the-number-of-full-binary-trees2525/1)**
