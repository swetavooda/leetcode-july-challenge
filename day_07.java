// problem link: https://leetcode.com/problems/island-perimeter/

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++) {
                if(grid[i][j]==0)
                    continue;
                if(i==0 || grid[i-1][j]==0) perimeter++;
                if(i==n-1 || grid[i+1][j]==0) perimeter++;
                if(j==0 || grid[i][j-1]==0) perimeter++;
                if(j==m-1 || grid[i][j+1]==0) perimeter++;
            }
        return perimeter;
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int mem[][]= new int[grid.length][grid[0].length];
        int r=grid.length,c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==0)
                    mem[i][j]=0;
                else
                {
                    mem[i][j]=4;
                    count+=4;
                    if(i-1>=0 && j>=0){
                        if (grid[i-1][j]>0)
                        {
                            mem[i][j]--;
                            mem[i-1][j]--;
                            count-=2;
                        }
                    }
                    if(i>=0 && j-1>=0)
                    {
                        if (grid[i][j-1]>0)
                        {
                            mem[i][j]--;
                            mem[i][j-1]--;
                            count-=2;
                        }
                    }
                }
            }
        }
        return count;
    }
}