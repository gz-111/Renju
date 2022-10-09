package com.guanhuan.renju;

import lombok.Getter;

/**
 * @author guanhuan_li
 */
@Getter
public enum Direction {

    /** 水平 */
    parallel,
    /** 垂直 */
    vertical,
    /** 左斜 / */
    left_slant,
    /** 右斜 \ */
    right_slant
}
