package com.guanhuan.renju;

import lombok.Data;

/**
 * 棋盘
 * @author guanhuan_li
 */
@Data
public class Chessboard {

    /**
     * 棋盘
     * 0空 1自己 2对面
     * 可以改成map
     * */
    private int[][] chessboard;

    /** 行 */
    private int row;

    /** 列 */
    private int col;

    public Chessboard(int row, int col) {
        this.row = row;
        this.col = col;
        chessboard = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chessboard[i][j] = 0;
            }
        }
    }

    /**
     * 对手下棋
     * @param point 点
     * @return 是否成功
     */
    public boolean oppoPlay(Point point) {
        if (chessboard[point.getRow()][point.getCol()] != 0) {
            return false;
        }

        chessboard[point.getRow()][point.getCol()] = -1;
        return true;
    }

    /**
     * 自己下
     * @param point 点
     * @return 是否成功
     */
    public boolean play(Point point) {
        if (chessboard[point.getRow()][point.getCol()] != 0) {
            return false;
        }

        chessboard[point.getRow()][point.getCol()] = 1;
        return true;
    }

    private int getStatus(Point point) {
        return chessboard[point.getRow()][point.getCol()];
    }

    private void setStatus(Point point, int i) {
        chessboard[point.getRow()][point.getCol()] = i;
    }
}
