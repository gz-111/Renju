package com.guanhuan.renju;

import lombok.Getter;

/**
 * @author guanhuan_li
 */
@Getter
public enum Event {

    /** 自己赢 */
    self_win(100),
    /** 对手赢 */
    oppo_win(90),
    /** 自己4连 */
    self_4(80),
    /** 对手4连 */
    oppo_4(70),
    /** 自己2个3连 */
    self_2_3(65),
    /** 自己3连 */
    self_3(60),
    /** 对手2个3连 */
    oppo_2_3(55),
    /** 对手3连 */
    oppo_3(50),
    /** 自己2连 */
    self_2(40),
    /** 对方2连 */
    oppo_2(30),
    /** 自己1连 */
    self_1(20),
    /** 对方1连 */
    oppo_1(10)
    ;


    /** 优先级 */
    private int code;

    Event(int code) {
        this.code = code;
    }

}
