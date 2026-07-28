class Solution {
    public void rotate(int[][] mat) {
        
    int r=mat.length;
    int c=mat[0].length;
    int ans[][]=new int [r][c];
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            ans[j][r-i-1]=mat[i][j];
        }
    }
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            mat[i][j]=ans[i][j];
        }
    }
    }
}