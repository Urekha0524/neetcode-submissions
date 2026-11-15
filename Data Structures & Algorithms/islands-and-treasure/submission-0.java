class Solution {
    private static final int INF = 2147483647;
    public void islandsAndTreasure(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return ;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0) q.add(new int[]{i,j});
            }
        } 

        int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            for(int[] d: directions){
               int nr = r+d[0];
               int nc = c+d[1];
               if(nr <0 ||nr >=m || nc <0 || nc >=n) continue;
               if(grid[nr][nc] != INF) continue;
               grid[nr][nc] = grid[r][c] +1;
               q.add(new int[]{nr,nc});
            }
        }

        return;
    }
}
