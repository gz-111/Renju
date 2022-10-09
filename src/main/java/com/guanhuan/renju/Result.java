package com.guanhuan.renju;

import lombok.Data;

import java.util.Objects;
import java.util.Set;

/**
 * @author guanhuan_li
 */
@Data
public class Result {

    private Point point;

    /** 自己的事件 */
    private Set<Event> selfEvent;

    /** 对方的事件 */
    private Set<Event> oppoEvent;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result result = (Result) o;
        return point.equals(result.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }
}
