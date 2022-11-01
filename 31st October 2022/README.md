# **Satisfy the equation**

**Medium** Accuracy: **17.42%** Submissions: **2472** Points: **4**

Given an array **A\[ \]** of **N** of integers, find the index of values that satisfy **A + B = C + D** where **A,B,C** &amp; **D** are integers values in the array.  
**Note:** As there may be multiple pairs satisfying the equation return lexicographically smallest order of A, B, C and D and return all as -1 if there are no pairs satisfying the equation.

**Example 1:**

```
Input:
N = 7
A[] = {3, 4, 7, 1, 2, 9, 8}
Output:
0 2 3 5
Explanation:
A[0] + A[2] = 3+7 = 10
A[3] + A[5] = 1+9 = 10
```

**Example 2:**

```
Input:
N = 4
A[] = {424, 12, 31, 7}
Output:
-1 -1 -1 -1
Explanation:
There are no pairs satisfying the equation.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **satisfyEqn()** which takes an Integer N and an array A\[\] of size N as input and returns a vector of 4 integers denoting A, B, C, and D respectively.

**Expected Time Complexity:** O(N2\*logN2)  
**Expected Auxiliary Space:** O(N2)

**Constraints:**  
1 &lt;= N &lt;= 500  
1 &lt;= A\[i\] &lt;= 105

Problem URL: **[Satify the equation](https://practice.geeksforgeeks.org/problems/satisfy-the-equation5847/1)**
