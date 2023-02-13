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

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let A = input_ar1[0];
        let B = input_ar1[1];
        let C = input_ar1[2];
        let obj = new Solution();
        let res = obj.inSequence(A, B, C);
        console.log(res);
        
    }
}// } Driver Code Ends


// } Driver Code Ends


class Solution{
    inSequence(A, B, C){
        if(C===0){
            return A===B ? 1 : 0;
        }
        const modulus = (B-A)%C;
        const isGreaterThanZero = (B-A)/C >=0
        if(modulus===0 && isGreaterThanZero){
            return 1;
        }
        else{
            return 0
        }
    }
}

