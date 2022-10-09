package com.guanhuan.renju;

/**
 * @author guanhuan_li
 */
public class DefaultCheck implements ChessCheck {

    @Override
    public boolean check(Chessboard chessboard, Result result, Point point) {
        return true;
    }
}
