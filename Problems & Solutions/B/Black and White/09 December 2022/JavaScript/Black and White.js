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
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let n = input_ar1[0];
        let m = input_ar1[1];
        let obj = new Solution();
        console.log(obj.numOfWays(n, m));
        
    }
}
// } Driver Code Ends

class Solution 
{
    numOfWays(n, m)
    {
        let x_off = [-2, -2, -1, 1, 2, 2, 1, -1];
        let y_off = [-1, 1, 2, 2, 1, -1, -2, -2];
        let MOD = 1000000007;
    
        let ret = 0;
        let x, y;
    
        for (let i = 0; i < n; ++i) 
        {
            for (let j = 0; j < m; ++j) 
            {
                for (let k = 0; k < 8; ++k)
                {
                    x = i + x_off[k];
                    y = j + y_off[k];
                    
                    if (x >= 0 && x < n && y >= 0 && y < m)
                        ++ret; 
                }
            }
        }
        let total = n * m;
        
        total = (total * (total - 1)) % MOD; 
        return (total + MOD - ret) % MOD; 
    }
}