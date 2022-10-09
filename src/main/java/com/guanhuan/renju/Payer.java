package com.guanhuan.renju;

import java.util.*;

/**
 * @author guanhuan_li
 */
public class Payer {

    /** 棋盘 */
    private Chessboard chessboard;

    /** 对对手需要进行的事件 */
    private TreeSet<Event> oppoEventSet;

    /** 对对手需要进行的检查 */
    private Map<Event, ? extends ChessCheck> oppoEvent2Check;

    /** 对对手需要进行的事件 */
    private TreeSet<Event> selfEventSet;

    /** 自己需要进行的检查 */
    private Map<Event, ? extends ChessCheck> selfEvent2Check;

    public Payer() {
        this.chessboard = new Chessboard(7, 7);
        this.oppoEventSet = new TreeSet<>();
        this.oppoEvent2Check = new HashMap<>();
        this.selfEventSet = new TreeSet<>();
        this.selfEvent2Check = new HashMap<>();
    }

    /**
     * 思考自己下一点之后的结果
     * @param point 对方上一步的点
     * @return 自己下的点
     */
    public Point think(Point point) {

        // 对手下棋
        chessboard.oppoPlay(point);

        // 需要考虑的点
        Set<Point> thinkPointSet = new HashSet<>();

        // 每个点都考虑
        Set<Result> results = new HashSet<>();
        for (Point selfPoint : thinkPointSet) {
            Result result = new Result();
            result.setPoint(selfPoint);
            for (Event event : oppoEventSet) {
                ChessCheck chessCheck = oppoEvent2Check.get(event);
                if (chessCheck.check(this.chessboard, result, point)) {
                    break;
                }
            }

            for (Event event : selfEventSet) {
                ChessCheck chessCheck = selfEvent2Check.get(event);
                if (chessCheck.check(this.chessboard, result, point)) {
                    break;
                }
            }
            results.add(result);
        }

        // 选出最好的结果
        Result best = results.iterator().next();
        return best.getPoint();
    }

}
