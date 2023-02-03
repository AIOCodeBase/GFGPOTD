# **Coordinates of the last cell in a Matrix on which performing given operations exits from the Matrix**

## **Easy**

Given a binary matrix of dimensions **N * M**. One can perform the given operation into the matrix.

If the value of **matrix[i][j]** is **0**, then traverse in the same direction and check the next value.
If the value of **matrix[i][j]** is **1**, then update **matrix[i][j]** to **0** and change the current direction from **up, right, down, or left** to the directions **right, down, left, and up** respectively.
Initially you start from **cell(0, 0)**, moving in **right** direction.

The task is to find the indices of the matrix  which leads to outside the matrix from the traversal of the given matrix from the cell **(0, 0)** by performing the operations.

**Example 1:**

```
Input:
matrix[][] = {{0,1},
              {1,0}}

Output: (1,1)
Explanation: We will leave the grid after visiting the index (1,1).
```

**Example 2:**

```
Input: 
matrix[][] = {{0, 1, 1, 1, 0},
                   {1, 0, 1, 0, 1},
              {1, 1, 1, 0, 0}}

Output: (2,0)
Explanation: We will leave the grid after visiting the index (2,0).
```

**Your Task:**  
You don't need to read input or print anything. Complete the function **endPoints()** that take the matrix as input parameter and output the last cell before the pointer gets outside of the matrix.

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(1)

**Constraints:**  
1<= N, M <=1000  
0<= matrix[i][j] <=1  

> ### **Problem URL: [Coordinates of the last cell in a Matrix on which performing given operations exits from the Matrix](https://practice.geeksforgeeks.org/problems/2e068e2342b9c9f40cfda1ed8e8119542d748fd8/1)**