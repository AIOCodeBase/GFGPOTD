//{ Driver Code Starts
//Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function printArray(res, size) {
    for(let i=0;i<size;i++){
        console.log(res[i]);
    }
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.maxArea(arr, n);
        console.log(res);
    }
}

// } Driver Code Ends

class Solution {
    maxArea(A, len){
        let l = 0;
    	let r = len -1;
    	let area = 0;
    
    	while (l < r)
    	{
    		area = Math.max(area, Math.min(A[l], A[r]) * (r - l));

    		if (A[l] < A[r])
    			l += 1;
    		else
    			r -= 1;
    	}
    	return area;
    }
}