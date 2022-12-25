# **Missing number in matrix**

## **Easy**

Given a matrix of size **n x n** such that it has only **one** 0, Find the **positive number** (greater than zero) to be placed in place of the 0 such that sum of the numbers in every row, column and two diagonals become equal. If no such number exists, return -1.

**Note:** Diagonals should be only of the form matrix\[i\]\[i\] and matrix\[i\]\[n-i-1\]. **n** is always greater than 1.

**Example 1:**

```
Input: matrix = {{5, 5}, {5, 0}}
Output: 5
Explanation: The matrix is
5 5
5 0
Therefore If we place 5 instead of 0, all
the element of matrix will become 5.
Therefore row 5+5=10, column 5+5=10 and
diagonal 5+5=10, all are equal.
```

**Example 2:**

```
Input: matrix = {{1, 2, 0}, {3, 1, 2},
{2, 3, 1}}
Output: -1
Explanation: It is not possible to insert
an element in place of 0 so that the
condition is satisfied.thus result is -1. 

```

**Your Task:**  
You don't need to read or print anyhting. Your task is to complete the function **MissingNo()** which takes the matrix as input parameter and returns the number which should be placed in place of 0 such that the condition gets satisfied. If not possible return -1.

**Expected Time Complexity:** O(n \* n)  
**Expected Space Complexity:** O(2 \* n)

**Constraints:**  
2 &lt;= n &lt;= 1000  
1 &lt;= elements in the matrix &lt;= 10^9

> ### **Problem URL: [Missing number in matrix](https://practice.geeksforgeeks.org/problems/missing-number-in-matrix5316/1)**
