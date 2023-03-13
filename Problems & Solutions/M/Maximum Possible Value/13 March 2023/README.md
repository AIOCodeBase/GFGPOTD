# **Maximum Possible Value**

## **Medium**

Given two arrays A[] and B[] of same length N. There are N types of sticks of lengths specified. Each stick of length A[i] is present in B[i] units (i=1 to N). You have to construct the squares and rectangles using these sticks. Each unit of a stick can be used as length or breadth of a rectangle or as a side of square. A single unit of a stick can be used only once.

Let S be the sum of lengths of all sticks that are used in constructing squares and rectangles. The task is to calulate the maximum possible value of S.

Note: The element in array A[] is always unique.

**Example 1:**

```
Input:
N = 4
A[] = {3,4,6,5}
B[] = {2,3,1,6}
Output: 
38
Explanation: 
There are 2 sticks of length 3.
There are 3 sticks of length 4.
There is a 1 stick of length 6.
There are 6 sticks of length 5.
One square can be made using 4 sticks of
4th kind (5*4=20)
A rectangle can be made using 2 sticks of 
4th kind and 2 sticks of 2nd kind (5*2+4*2=18)
S = 20 + 18 = 38
```

**Example 2:**

```
Input:
N = 1
A[] = {3}
B[] = {2}
Output: 
0
Explanation: 
There are only 2 sticks of length 3 which are 
not enough to make the square or rectangle.
```

**Your Task:**  

You don't need to read input or print anything. Complete the function maxPossibleValue( ) which takes the integer N , the array A[], and the array B[] as input parameters and returns the maximum possible value of S. 

**Expected Time Complexity:** O(N)  
**Expected Space Complexity:** O(1)    

**Constraints:**

1 ≤ N ≤ $10^5$  
1 ≤ A[] ≤ $10^5$  
1 ≤ B[] ≤ $10^2$   

> ### **Problem URL: [Maximum Possible Value](https://practice.geeksforgeeks.org/problems/2d3fc3651507fc0c6bd1fa43861e0d1c43d4b8a1/1)**
