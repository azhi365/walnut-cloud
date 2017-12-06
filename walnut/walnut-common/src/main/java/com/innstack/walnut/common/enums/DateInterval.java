package com.innstack.walnut.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.Maps;
import org.springframework.util.Assert;

import java.util.Map;

public enum DateInterval {

    /**
     * 小时
     */
    HOUR(1, "1h"),

    /**
     * 天
     */
    DAY(2, "1d"),

    /**
     * 周
     */
    WEEK(3, "1w"),

    /**
     * 月
     */
    MONTH(4, "1M"),

    /**
     * 当前天小时
     */
    CURRENT_HOUR(1, "1h"),;

    private static Map<Integer, DateInterval> map = Maps.newHashMapWithExpectedSize(4);

    static {
        for (DateInterval dateInterval : DateInterval.values()) {
            map.put(dateInterval.type, dateInterval);
        }
    }

    private int type;
    private String interval;

    DateInterval(int type, String interval) {
        this.type = type;
        this.interval = interval;
    }

    @JsonCreator
    public static DateInterval valueOf(int value) {
        DateInterval dateInterval = map.get(value);
        Assert.notNull(dateInterval, "not defined Enum");
        return dateInterval;
    }

    @JsonValue
    public int getType() {
        return type;
    }

    public String getInterval() {
        return interval;
    }

    @Override
    public String toString() {
        return String.valueOf(interval);
    }

}
