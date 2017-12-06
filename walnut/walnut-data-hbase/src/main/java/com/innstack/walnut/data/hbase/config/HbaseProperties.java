package com.innstack.walnut.data.hbase.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = HbaseProperties.HBASE_PREFIX)
public class HbaseProperties {

    public static final String HBASE_PREFIX = "hbase";

    private String quorum;

    public String getQuorum() {
        return quorum;
    }

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }
}
