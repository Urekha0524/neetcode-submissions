class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh=0;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]== 2) q.add(new int[]{i,j});
                else if(grid[i][j] == 1) fresh++;
            }
        }

        if(fresh == 0) return 0;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int minutes = 0;
        while(!q.isEmpty()){
            boolean rottenThisMinute = false;
            int size = q.size();
            for(int i=0; i<size; i++){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
              for(int[] d : directions){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr <0 || nr>=m || nc<0 || nc >=n) continue;
                if(grid[nr][nc] !=1) continue;
                grid[nr][nc] =2;
                q.add(new int[]{nr,nc});
                rottenThisMinute = true;
                fresh--;
              }
                
            }

            if(rottenThisMinute) minutes++;

        }

        return (fresh == 0) ? minutes:-1; 
    }
}
