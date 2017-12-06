package com.innstack.walnut.common.service;


import com.innstack.walnut.common.model.PageInfo;

public interface BasePageService<T> extends BaseService<T> {

    PageInfo<T> listPage(PageInfo<T> pageInfo, T entity);
}
