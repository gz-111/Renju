package com.guanhuan.renju;

/**
 * @author guanhuan_li
 */
public interface ChessCheck {

    /**
     * 检查事件
     * @param chessboard 棋盘
     * @param point 点
     * @param result 结果
     * @return 是否存在当前情况
     */
    boolean check(Chessboard chessboard, Result result, Point point);


}
