# **Distinct Coloring**

## **Medium**

There is a row of **N** houses, each house can be painted with one of the three colors: red, blue or green. The cost of painting each house with a certain color is different. You have to paint all the houses such that no two adjacent houses have the same color. Find the minimum cost to paint all houses.

The cost of painting each house in red, blue or green colour is given in the array **r\[\]**, **g\[\]** and **b\[\]** respectively.

  
**Example 1:**

```
Input:
N = 3
r[] = {1, 1, 1}
g[] = {2, 2, 2}
b[] = {3, 3, 3}
Output: 4
Explanation: We can color the houses 
in RGR manner to incur minimum cost.
We could have obtained a cost of 3 if 
we coloured all houses red, but we 
cannot color adjacent houses with 
the same color.


```

  
**Example 2:**

```
Input:
N = 3
r[] = {2, 1, 3}
g[] = {3, 2, 1}
b[] = {1, 3, 2} 
Output: 3
Explanation: We can color the houses
in BRG manner to incur minimum cost.
```

  
  
**Your Task:**   
You don't need to read input or print anything. Your task is to complete the function **distinctColoring()** which takes the size **N** and the color arrays **r\[\]**, **g\[\]**, **b\[\]** as input parameters and returns the minimum cost of coloring such that the color of no two houses is same.

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(N)

**Constraints:**

1 &lt;= N &lt;= 5\*$10^4$

1 &lt;= r\[i\], g\[i\], b\[i\] &lt;= $10^6$

> ### **Problem URL: [Distinct Coloring](https://practice.geeksforgeeks.org/problems/844b4fdcd988ac5461324d62d43f7892749a113c/1)**