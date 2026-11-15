class Solution {
    private final static int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int r = 0; r< rows; r++){
            for(int c=0; c< cols; c++){
                if(grid[r][c] == 1)
                 {
                    int area = dfs(grid, r,c);
                    maxArea = Math.max(maxArea, area);
                 }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int r, int c){
        if(r<0 || c<0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 )
          return 0;

        grid[r][c] = 0;
        int area = 1;
        for(int[] dir : directions){
          area += dfs(grid, r+dir[0], c+ dir[1]);
        }
      return area;
    }
}
