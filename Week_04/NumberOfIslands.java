package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:05 PM
 */
public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    boolean visited[][] = new boolean[grid.length][grid[0].length];
    int res = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          res++;
          dfs(i, j, grid, visited);
        }
      }
    }
    return res;
  }

  private void dfs(int row, int col, char[][] grid, boolean visited[][]) {
    if (row == grid.length || col == grid[0].length || row < 0 || col < 0 || grid[row][col] == '0'
        || visited[row][col]) {
      return;
    }
    visited[row][col] = true;
    dfs(row - 1, col, grid, visited);
    dfs(row, col - 1, grid, visited);
    dfs(row + 1, col, grid, visited);
    dfs(row, col + 1, grid, visited);
  }

}
