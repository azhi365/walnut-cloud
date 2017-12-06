package com.innstack.walnut.data.hbase.exception;

import org.springframework.dao.UncategorizedDataAccessException;

public class HbaseException extends UncategorizedDataAccessException {

    public HbaseException(Exception cause) {
        super(cause.getMessage(), cause);
    }

    public HbaseException(Throwable throwable) {
        super(throwable.getMessage(), throwable);
    }
}
