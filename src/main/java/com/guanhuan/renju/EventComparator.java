package com.guanhuan.renju;

import java.util.Comparator;

/**
 * @author guanhuan_li
 */
public class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getCode()-o2.getCode();
    }
}
