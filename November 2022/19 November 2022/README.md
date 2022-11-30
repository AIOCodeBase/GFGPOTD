# **Check if all levels of two trees are anagrams or not**

## **Hard**

Given two binary trees, the task is to check if each of their levels are anagrams of each other or not.

**Example 1:**

```
Input:

Output: 1
Explanation:
Tree 1:
Level 0 : 1
Level 1 : 3, 2
Level 2 : 5, 4

Tree 2:
Level 0 : 1
Level 1 : 2, 3
Level 2 : 4, 5

As we can clearly see all the levels of above two binary trees
are anagrams of each other, hence return true.

```

**Example 2:**

```
Input:

Output: 0
Explanation:
Tree 1:
Level 0 : 1
Level 1 : 2, 3
Level 2 : 5, 4

Tree 2:
Level 0 : 1
Level 1 : 2, 4
Level 2 : 5, 3

As we can clearly see that level 1 and leve 2 are not anagrams of each other, hence return false.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **areAnagrams()** which takes the root of two trees as input and returns an 1 if all the levels are anagrams, else returns 0 as output.

**Expected Time Complexity:** O(NlogN)  
**Expected Auxiliary Space:** O(N)

**Constraints:**

- `1 <= N <= 10^4`
- `1 <= tree.val <= 10^9`

> ### **Problem URL: [Check if all levels of two trees are anagrams or not](https://practice.geeksforgeeks.org/problems/check-if-all-levels-of-two-trees-are-anagrams-or-not/1)**
