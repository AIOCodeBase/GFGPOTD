# Enemy

**Medium**

Accuracy: **34.32%** Submissions: **928** Points: **4**

You live in Geek land. Geek land can be seen as a grid of shape **N** x **M**.Their are **K** enemy at **K** positions. Each enemy blocks the row and column to which it belongs. You have to find the largest continuous area that is not blocked.No two enemies share the same row or the same column.

**Example 1:**

```
Input:
N = 2
M = 2
K = 1
enemy[]={{2,2}}
Output:
1
Explanation:
Since only (1,1) cell is free from the enemy hence answer is 1.
```

**Example 2:**

```
Input:
N = 3
M = 3
K = 1
enemy[]={{3,3}}
Output:
4
Explanation:
The cells (1,1),(1,2) ,(2,1) and (2,2) are free hence answer =4.
```

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **largestArea()** which takes the size of geek land **n,m** and a 2-D matrix **enemy** of size **k** denoting the coordinates of the enemy's and need to return the largest area that is free.

**Expected Time Complexity:** O(KlogK)  
**Expected Auxiliary Space:** O(K)

**Constraints:**  
1 &lt;= N,M &lt;= 104  
0&lt;=K&lt;=min(N,M)  
1&lt;=Xi&lt;=N  
1&lt;=Yi&lt;=M

> ### Problem URL: **[Enemy](https://practice.geeksforgeeks.org/problems/enemy/1)**
