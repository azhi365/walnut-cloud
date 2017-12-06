package com.innstack.walnut.common.service;

import com.alibaba.fastjson.JSON;
import com.innstack.walnut.common.model.PageInfo;
import com.github.pagehelper.PageHelper;

import java.util.List;


public abstract class PageServiceImpl<T> extends LoggerService implements BasePageService<T> {

    @Override
    public PageInfo<T> listPage(PageInfo<T> pageInfo, T entity) {
        logger.debug("listPage pageNum:{}, pageSize:{}, entity:{}", pageInfo.getPageNum(), pageInfo.getPageSize(), JSON.toJSONString(entity));
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        List<T> list = this.listAll(entity);
        PageInfo page = new PageInfo(list);
        return page;
    }

    @Override
    public List<T> listAll() {
        logger.debug("pageService Impl listAll");
        return this.listAll(null);
    }
}
