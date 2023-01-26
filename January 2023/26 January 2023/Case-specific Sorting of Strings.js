//{ Driver Code Starts
//Initial Template for javascript

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
        let string = readLine();
        
        let obj = new Solution();
        let ans = obj.caseSort(string, n);
        
        console.log(ans);
    }
}
// } Driver Code Ends

class Solution {
    caseSort(str, n) {
        let vecA = [], veca = [];
        
		for(let i=0;i<n;i++)
		{
			if(`${str.charCodeAt(i)}` < 97)
			vecA.push(str[i]);
			else
			veca.push(str[i]);
		}
		
		vecA.sort();
		veca.sort();
		
		let vcA=0,vca=0;
		let answer="";
		
		for(let i=0;i<n;i++)
		{
			if(`${str.charCodeAt(i)}` < 97)
			answer+=vecA[vcA++];
			
			else
			answer+=veca[vca++];
		}
		return answer;
    }
}

