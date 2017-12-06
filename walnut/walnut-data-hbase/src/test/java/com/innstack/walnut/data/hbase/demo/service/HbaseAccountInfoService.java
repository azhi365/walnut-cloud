package com.innstack.walnut.data.hbase.demo.service;

import com.innstack.walnut.data.hbase.demo.dao.HbaseAccountInfoMapper;
import com.innstack.walnut.data.hbase.demo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hbaseAccountInfoService")
public class HbaseAccountInfoService {

    @Autowired
    HbaseAccountInfoMapper hbaseAccountInfoMapper;

    public UserInfo getUserInfo(String table, String family, String rowKey) {
        return hbaseAccountInfoMapper.findUserInfoByEntity(table, family, rowKey);
    }

    public List<UserInfo> listUserInfos(String tableName, String family) {
        return hbaseAccountInfoMapper.findAll(tableName, family);
    }
}

