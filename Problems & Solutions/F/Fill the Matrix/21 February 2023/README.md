# **Fill the Matrix**

## **Medium**

Given a matrix with dimensions N x M, entirely filled with zeroes except for one position at co-ordinates X and Y containing '1'. Find the minimum number of iterations in which the whole matrix can be filled with ones.

Note: In one iteration, '1' can be filled in the 4 neighbouring elements of a cell containing '1'.

**Example 1:**

Input:  
N = 2, M = 3  
X = 2, Y = 3  
Output: 3   

![iteration1](https://user-images.githubusercontent.com/97666287/220410350-a2665b1e-1f06-4c7b-94bd-e54b038efcd9.png)

Explanation: 3 is the minimum possible   
number of iterations in which the  
matrix can be filled.  

**Example 2:**

Input:  
N = 1, M = 1  
X = 1, Y = 1   
Output: 0  

![iter0](https://user-images.githubusercontent.com/97666287/220410825-9ebbb2b7-afde-4e0d-a3fc-d88e60eae108.png)

Explanation: The whole matrix is   
already filled with ones.  

**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function minIterations() which takes the dimensions of the matrix N and M and the co-ordinates of the initial position of '1' ie X and Y as input parameters and returns the minimum number of iterations required to fill the matrix.

**Expected Time Complexity:** O(N * M)  
**Expected Space Complexity:** O(1)    

**Constraints:**

1 ≤ N, M ≤ $10^3$  
1 ≤ X ≤ N  
1 ≤ Y ≤ M   

> ### **Problem URL: [Fill the Matrix](https://practice.geeksforgeeks.org/problems/2145720aebf8ea0b07f76b17217b3353a0fbea7f/1)**
