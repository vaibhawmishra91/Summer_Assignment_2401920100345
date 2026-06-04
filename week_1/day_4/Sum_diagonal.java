class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int sum1=0;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i-j==0){
                    sum+=mat[i][j];
                }
                if(i+j==n-1){
                    sum1+=mat[i][j];
                }
            }
        }
        if(n%2!=0 && m%2!=0){
            return sum=sum+sum1-mat[n/2][m/2];
        }
        return sum+sum1;
    }
}