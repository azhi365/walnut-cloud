package com.innstack.walnut.fastdfs.config;

import com.alibaba.fastjson.JSON;
import com.innstack.walnut.fastdfs.client.FastDFSClient;
import com.github.tobato.fastdfs.FdfsClientConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(FastDFSProperties.class)
@ConditionalOnClass(FdfsClientConfig.class)
@ConditionalOnBean(FastFileStorageClient.class)
@Import(FdfsClientConfig.class)
public class FastDFSAutoConfiguration {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final FastDFSProperties properties;

    public FastDFSAutoConfiguration(FastDFSProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void checkConfigFileExists() {
        logger.info("FastDFSProperties :{}", JSON.toJSONString(properties));
    }

    @Bean(name = "fastDFSClientWrapper")
    public FastDFSClient getFastDFSClientWrapper() {
        FastDFSClient fastDFSClientWrapper = new FastDFSClient();
        fastDFSClientWrapper.setHasFastDfsNginx(properties.isHasNginxWeb());
        fastDFSClientWrapper.setFastDfsNginx(properties.getNginxWeb());
        logger.info("getFastDFSClientWrapper :{}", fastDFSClientWrapper);
        return fastDFSClientWrapper;
    }
}
