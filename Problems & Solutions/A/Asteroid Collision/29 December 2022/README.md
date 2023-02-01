# **Asteroid Collision**

## **Medium**

We are given an integer array **asteroids** of size **N** representing asteroids in a row. For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.  
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are of same size, both will explode. Two asteroids moving in the same direction will never meet.

**Example 1:**

**Input:**  
N = 3  
asteroids\[ \] = {3, 5, -3}  
**Output:** {3, 5}  
**Explanation:** The asteroid 5 and -3 collide resulting in 5. The 5 and 3 never collide.**Example 2:**

**Input:**  
N = 2  
asteroids\[ \] = {10, -10}  
**Output:** { }  
**Explanation:** The asteroid -10 and 10 collide exploding each other.**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function **asteroidCollision()** which takes the array of integers **asteroids** and **N** as parameters and returns the state of asteroids after all collisions.

**Expected Time Complexity:** O(N)  
**Expected Auxiliary Space:** O(N)

**Constraints:**  
1 ≤ N ≤ 10^5  
-1000 ≤ asteroidsi ≤ 1000  
asteroids\[i\]!=0

> ### **Problem URL: [Asteroid Collision](https://practice.geeksforgeeks.org/problems/asteroid-collision/1)**
