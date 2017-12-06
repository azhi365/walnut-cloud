package com.innstack.walnut.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LoggerService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
}
