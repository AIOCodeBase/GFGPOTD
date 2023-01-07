# F**ind the longest string**

**Medium**

Given an array of strings **arr\[\]**. You have to find the longest string which is lexicographically smallest and also all of its prefix strings are already present in the array.

**Example 1:**

```
Input: ab a abc abd
Output: abc
Explanation: We can see that length of the longest 
string is 3. And there are two string "abc" and "abd"
of length 3. But for string "abc" , all of its prefix
"a" "ab" "abc" are present in the array. So the
output is "abc".
```

**Example 2:**

```
Input: ab a aa abd abc abda abdd abde abdab
Output: abdab
Explanation: We can see that each string is fulfilling
the condition. For each string, all of its prefix 
are present in the array.And "abdab" is the longest
string among them. So the ouput is "abdab".
```

**Your Task:**   
You don't need to read input or print anything. Your task is to complete the function **longestString()** which takes the array arr**\[\]** as input parameter and returns the **longest string** which is also lexicographically smallest.And if there is no such string return empty string.

**Expected Time Complexity:** O(NlogN)  
**Expected Space Complexity:** O(N)

**Constraints:**  
1 &lt;= length of arr\[\] &lt;= 10^3  
1 &lt;= arr\[i\].length &lt;=30

> ### **Problem URL: [Find the longest string](https://practice.geeksforgeeks.org/problems/8d157f11af5416087251513cfc38ffc4d23be308/1)**