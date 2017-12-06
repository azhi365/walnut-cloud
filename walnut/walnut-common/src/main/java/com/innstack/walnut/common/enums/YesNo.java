package com.innstack.walnut.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.Maps;

import java.util.Map;

public enum YesNo {

    /**
     * YES: 1
     */
    YES(1),

    /**
     * No: 0
     */
    NO(0),;

    private static Map<Integer, YesNo> map = Maps.newHashMapWithExpectedSize(2);

    static {
        for (YesNo yesNo : YesNo.values()) {
            map.put(yesNo.value, yesNo);
        }
    }

    private int value;

    private YesNo(int value) {
        this.value = value;
    }

    @JsonCreator
    public static YesNo valueOf(int value) {
        return map.get(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
