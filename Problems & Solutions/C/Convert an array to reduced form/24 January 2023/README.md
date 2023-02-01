# **Convert an array to reduced form**

## **Medium**

Given an array with **N** distinct elements, convert the given array to a reduced form where all elements are in range from **0** to **N-1**. The order of elements is same, i.e., **0** is placed in place of smallest element, **1** is placed for second smallest element, **N-1** is placed for largest element.

**Note**: You don't have to return anything. You just have to change the the given array.

**Example 1:**

```
Input:
N = 3
Arr[] = {10, 40, 20}
Output: 0 2 1
Explanation: 10 is the least element so it
is replaced by 0. 40 is the largest
element so it is replaced by 3-1 = 2. And
20 is the 2nd smallest element so it is
replaced by 1.
```

  
**Example 2:**

```
Input:
N = 5
Arr[] = {5, 10, 40, 30, 20}
Output: 0 1 4 3 2
Explanation: As 5 is smallest element,
it's replaced by 0. Then 10 is 2nd
smallest element, so it's replaced by 1.
Then 20 is 3rd smallest element, so it's
replaced by 2. And so on.
```

  
**Your Task:**   
You don't need to read input or print anything. Your task is to complete the function **convert()** which takes the array of integers **arr** and **n** as parameters and make changes in the given array.

**Expected Time Complexity:** O(N*logN)   
**Expected Auxiliary Space:** O(N)   

  
**Constraints:**  
1 ≤ N ≤ 10^5  
1 ≤ Arr[i] ≤ 10^6  

> ### **Problem URL: [Convert an array to reduced form](https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1)**
