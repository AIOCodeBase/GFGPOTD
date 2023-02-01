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
    for(let i=0;i<t;i++)
    {
        let input_line = readLine().split(' ');
        let n = parseInt(input_line[0]);
        
        let arr = new Array(n);
        
        input_line = readLine().split(' ');
        for(let i=0;i<n;i++)
        {
            arr[i] = parseInt(input_line[i]);
        }
        
        let obj = new Solution();
        
        let ans = obj.findSubarray(arr, n)
        console.log(ans);
    }
}
// } Driver Code Ends

class Solution {
    findSubarray(arr, n){
        
        let mp = new Map();
        let sum = 0;
    	let counter=0;
    	
        for (let i = 0; i < n; i++)
    	{
    		sum = sum + arr[i];
    		
        	if (sum == 0)
    		{
    			counter++;
    		}
    		
    	    if(mp.has(sum)) 
            {
                counter+=mp.get(sum);
            }
    		
    		if(!mp.has(sum))
    		    mp.set(sum,1);
    		else
    		    mp.set(sum,mp.get(sum)+1);
    	}
    	return counter;   
    }
}