//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    
    bool check(int a , int b , int r , int c){
        if(a < 0 || a >= c || b < 0 || b >= r)
            return false;
        return true;
    }
    
    pair<int,int> endPoints(vector<vector<int>> matrix, int R, int C){

        int x = 0 , y = 0 , dr = 0;
        int dry[] = {0 , 1 , 0 , -1};
        int drx[] = {1 , 0 , -1 , 0};

        while(check(x, y, R, C)){
            if(matrix[y][x]){
                dr = (dr + 1) % 4;
                matrix[y][x] = 0;
            }
            x += drx[dr];
            y += dry[dr];
        }

        return {y - dry[dr] , x - drx[dr]};
    }
};

//{ Driver Code Starts.


int main()
{
    int tc;
	scanf("%d", &tc);
	while(tc--){
		int row, col;
		scanf("%d", &row);
		scanf("%d", &col);
		vector<vector<int>> matrix(row , vector<int> (col));
	 
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
			    cin>>matrix[i][j];
			}
		}
		Solution obj;
		pair<int,int> p = obj.endPoints(matrix, row, col);
		
		cout << "(" << p.first << ", " << p.second << ")" << endl;
	}
	return 0;
}
// } Driver Code Ends
