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

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            arr[i] = input_ar1[i];
        let obj = new Solution();
        obj.rearrange(arr, n);
        let S = '';
        for(let i=0;i<n;i++)
        {
            S+=arr[i];
            S+=' ';
        }
        console.log(S);
    }
}
// } Driver Code Ends

class Solution {
    rearrange(arr, n){
         
    	let max_idx = n - 1, min_idx = 0; 
    
    	let max_elem = arr[n - 1] + 1; 
    
    	for (let i = 0; i < n; i++) { 
    	    
    		if (i % 2 === 0) { 
    			arr[i] += (arr[max_idx] % max_elem) * max_elem; 
    			max_idx--; 
    		} 
    
    		else { 
    			arr[i] += (arr[min_idx] % max_elem) * max_elem;
    			min_idx++; 
    		} 
    	} 
    
    	for (let i = 0; i < n; i++) 
    		arr[i] = Math.floor(arr[i] / max_elem); 
        }
}