package com.ran.leetcode.dfs;

import java.util.Objects;

/**
 * WordSearch_79
 *
 * @author rwei
 * @since 2023/10/9 16:42
 */
public class WordSearch_79 {
    public static void main(String[] args) {
        WordSearch_79 obj = new WordSearch_79();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(obj.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[] visited = new boolean[row * col];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (dfs(board,visited,word,i,j,row,col,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[] visited, String word, int i, int j, int row, int col, int index) {
        if (index == word.length()) return true;
        if (i < 0 || i >= row || j < 0 || j >= col) return false;
        if (visited[i * col + j]) return false;
        if (board[i][j] != word.charAt(index)) return false;
        visited[i * col + j] = true;
        if (dfs(board, visited, word, i + 1, j, row, col, index + 1) ||
                dfs(board, visited, word, i - 1, j, row, col, index + 1) ||
                dfs(board, visited, word, i, j + 1, row, col, index + 1) ||
                dfs(board, visited, word, i, j - 1, row, col, index + 1)) {
            return true;
        }
        visited[i * col + j] = false;
        return false;
    }
}
