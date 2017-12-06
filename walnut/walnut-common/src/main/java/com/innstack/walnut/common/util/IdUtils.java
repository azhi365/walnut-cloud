package com.innstack.walnut.common.util;


import com.innstack.walnut.common.exception.GlobalErrorCode;
public class IdUtils {

    public static String getId(Long tenantId, String bizId) {
        AssertUtils.notNull(tenantId, GlobalErrorCode.TENANTID_ID_NOT_EMPTY);
        return String.format("%s:%s", tenantId, bizId);
    }
}
