class Solution {
    public void dfs(int [][]grid , int r, int c){
        //base case
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return;
        }
        //work
        grid[r][c]=0;
        //recursive calls
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
    public int numEnclaves(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //first row
                if(i==0 && grid[i][j]==1){
                    dfs(grid,i,j);
                }
                //last row
                if(i==grid.length-1 && grid[i][j]==1){
                    dfs(grid,i,j);
                }
                //first column
                if(j==0 && grid[i][j]==1){
                    dfs(grid,i,j);
                }
                //last column
                if(j==grid[0].length-1 && grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}