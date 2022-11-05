# Median in a row-wise sorted Matrix

**Medium**

Given a row wise sorted matrix of size **R\*C** where R and C are always **odd**, find the median of the matrix.

**Example 1:**

```
Input:
R = 3, C = 3
M = [[1, 3, 5],
     [2, 6, 9],
     [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median.

```

**Example 2:**

```
Input:
R = 3, C = 1
M = [[1], [2], [3]]
Output: 2
Explanation: Sorting matrix elements gives
us {1,2,3}. Hence, 2 is median.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **median()** which takes the integers **R** and **C** along with the 2D **matrix** as input parameters and returns the **median** of the matrix.

**Expected Time Complexity:** O(32 \* R \* log(C))  
**Expected Auxiliary Space:** O(1)

**Constraints:**  
1 &lt;= R, C &lt;= 400  
1 &lt;= matrix\[i\]\[j\] &lt;= 2000

> ### Problem URL: **[Median in a row-wise sorted Matrix](https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1)**
